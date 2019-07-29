package io.github.gravetii.scene.start;

import io.github.gravetii.controller.start.QuickOptionsController;
import io.github.gravetii.scene.FxComponent;
import javafx.scene.layout.AnchorPane;

public class QuickOptionsComponent extends FxComponent<QuickOptionsController, AnchorPane> {
  private StartScene parent;

  public QuickOptionsComponent(StartScene parent) {
    super("quickOptions.fxml");
    this.parent = parent;
    create();
  }

  @Override
  protected QuickOptionsController createController() {
    return new QuickOptionsController(parent);
  }

  @Override
  protected AnchorPane createNode() {
    return loadNode();
  }
}
