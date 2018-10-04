package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Comando extends Application {

	public static void main(String[] args) {

	    launch(args);
	  }

	  @Override
	    public void start(Stage primaryStage) throws Exception {

	    Parent root = FXMLLoader.load(getClass().getResource("/fxml/Panel.fxml"));
	    Scene scene = new Scene(root, 600,400);
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("JavaFx");
	    primaryStage.show();
	  }
}
