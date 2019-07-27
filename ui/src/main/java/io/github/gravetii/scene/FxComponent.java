package io.github.gravetii.scene;

import io.github.gravetii.controller.FxController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

public abstract class FxComponent<C extends FxController, N extends Node> {
  private C controller;
  private N node;
  private String fxml;

  protected FxComponent(String fxml) {
    this.fxml = fxml;
  }

  protected abstract C createController();

  protected abstract N createNode();

  protected void create() {
    this.controller = createController();
    this.node = createNode();
  }

  protected N loadNode() {
    try {
      FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource("fxml/" + this.fxml));
      loader.setController(this.controller);
      return loader.load();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public C getController() {
    return controller;
  }

  public N getNode() {
    return node;
  }
}
