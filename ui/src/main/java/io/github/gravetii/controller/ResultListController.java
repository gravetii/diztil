package io.github.gravetii.controller;

import io.github.gravetii.client.DiztlClient;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ResultListController implements FxController {
  private Stage stage;
  private DiztlClient client;

  @FXML private TableView<FileResult> resultListTbl;
  @FXML private TableColumn<FileResult, String> fileNameTblCol;
  @FXML private TableColumn<FileResult, Long> fileSizeTblCol;

  public ResultListController(Stage stage) {
    this.stage = stage;
    this.client = new DiztlClient();
  }

  @FXML
  public void initialize() {
    this.fileNameTblCol.setCellValueFactory(new PropertyValueFactory<>("fileName"));
    this.fileSizeTblCol.setCellValueFactory(new PropertyValueFactory<>("fileSize"));
  }

  public void show(FileResult value) {
    this.resultListTbl.getItems().add(value);
  }

}
