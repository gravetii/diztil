package io.github.gravetii.client.handler;

import io.github.gravetii.client.connection.Connection;
import io.github.gravetii.gen.Diztl;
import io.github.gravetii.scene.start.StartScene;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DownloadHandler {
  private static final Logger logger =
      LoggerFactory.getLogger(DownloadHandler.class.getCanonicalName());

  private Diztl.FileMetadata file;
  private Diztl.Node source;
  private StartScene scene;
  private DownloadResult result;

  public DownloadHandler(Diztl.FileMetadata file, Diztl.Node source, StartScene scene) {
    this.file = file;
    this.source = source;
    this.scene = scene;
    this.result = new DownloadResult();
  }

  public void process(Connection connection) {
    logger.info("Downloading file from {} - {}", source.getIp(), file.getName());
    Diztl.DownloadReq req =
        Diztl.DownloadReq.newBuilder().setMetadata(file).setSource(source).build();
    connection.getAsyncstub().download(req, createObserver());
  }

  private StreamObserver<Diztl.DownloadChunk> createObserver() {
    return new StreamObserver<Diztl.DownloadChunk>() {
      @Override
      public void onNext(Diztl.DownloadChunk value) {
        if (value.getChunk() == 1) {
          result.setFile(value.getMetadata());
          ExecutionHandler.submit(result);
          scene.showDownloadResult(result);
        } else {
          result.update(value.getChunk());
        }
      }

      @Override
      public void onError(Throwable t) {
        logger.error("Error while downloading file:", t);
      }

      @Override
      public void onCompleted() {
        logger.info("Finished downloading file: {}", file.getName());
      }
    };
  }
}
