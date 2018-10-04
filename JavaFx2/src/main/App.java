package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Anticiparse a cambios y ocultar información.
 * Autor:Javier Miguel Juárez Flores.
 * Verión:1.0.
 * Fecha:24/09/2018.
 */

public class App extends Application {

  public static void main(String[] args) {

    launch(args);
  }

  /**
   * Metodo que carga la pantalla principal del programa.
   */
  
  @Override
    public void start(Stage primaryStage) throws Exception {

    Parent root = FXMLLoader.load(getClass().getResource("/fxml/Panel.fxml"));
    Scene scene = new Scene(root, 600,400);
    primaryStage.setScene(scene);
    primaryStage.setTitle("JavaFx");
    primaryStage.show();
  }
}
