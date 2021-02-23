package io.github.gravetii;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.github.gravetii.client.DiztlClient;
import io.github.gravetii.grpc.RegisterResp;
import io.github.gravetii.node.DiztlServiceImpl;
import io.github.gravetii.scene.FxScene;
import io.github.gravetii.scene.start.StartScene;
import io.github.gravetii.util.DiztlExecutorService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/** JavaFX App */
public class App extends Application {

  private static final Logger logger = LoggerFactory.getLogger(App.class.getCanonicalName());

  private Server server;

  public static void display(Stage stage, FxScene scene) {
    stage.setScene(new Scene(scene.root));
    stage.setTitle(scene.title());
    scene.preferredDimensions().ifPresent(x -> x.setFor(stage));
    stage.show();
  }

  @Override
  public void start(Stage stage) throws Exception {
    Injector injector = Guice.createInjector(new StartupModule());
    stage.setOnCloseRequest(
        event -> {
          DiztlExecutorService.close();
          server.shutdown();
          try {
            server.awaitTermination(2, TimeUnit.MINUTES);
            server.shutdownNow();
          } catch (InterruptedException e) {
            logger.error("Thread interrupted while waiting server termination", e);
          }
        });

    StartScene scene = injector.getInstance(StartScene.class);
    App.display(stage, scene);

    new Thread(
            () -> {
              try {
                this.startServer();
                logger.info("Started diztl server...");
                if (server != null) server.awaitTermination();
              } catch (Exception e) {
                logger.error("Error while starting diztl server", e);
              }
            })
        .start();

    scene.index();
    registerToTracker(scene);
  }

  private void registerToTracker(StartScene scene) throws Exception {
    ListenableFuture<RegisterResp> registerResp = DiztlClient.register();
    registerResp.addListener(
        () -> {
          try {
            DiztlClient.node = registerResp.get().getNode();
            scene.writeToLog("Successfully register to tracker.");
          } catch (Throwable throwable) {
            scene.writeToErrorLog("Couldn't register to tracker.");
            logger.error("Error while registering to tracker", throwable);
          }
        },
        DiztlExecutorService.executor);
  }

  private void startServer() throws IOException {
    this.server = ServerBuilder.forPort(50035).addService(new DiztlServiceImpl()).build().start();
  }

  private static Parent loadFXML(String fxml) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    return fxmlLoader.load();
  }

  public static void main(String[] args) {
    logger.info("Launching application...");
    launch();
  }
}