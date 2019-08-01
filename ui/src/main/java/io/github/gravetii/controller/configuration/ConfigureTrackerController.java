package io.github.gravetii.controller.configuration;

import io.github.gravetii.AppContext;
import io.github.gravetii.client.connection.CommunicationClient;
import io.github.gravetii.controller.FxController;
import io.github.gravetii.scene.start.StartScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConfigureTrackerController implements FxController {
  private Stage stage;
  private StartScene scene;

  @FXML private TextField ipBox;

  public ConfigureTrackerController(Stage stage, StartScene scene) {
    this.stage = stage;
    this.scene = scene;
  }

  @FXML
  private void initialize() {
    ipBox.setText(AppContext.getTracker());
  }

  public void ok(ActionEvent event) {
    String ip = ipBox.getText();
    if (!ip.isEmpty()) {
      CommunicationClient.get().updateTracker(ip, scene);
    }

    stage.close();
  }

  public void cancel(ActionEvent event) {
    stage.close();
  }
}