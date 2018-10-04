package employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application {
	private static Stage primaryStage;
	private  static BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage= primaryStage;
		this.primaryStage.setTitle("Login");
		showMainView();
		
		
	}
	public static void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/Loginbueno.fxml"));
		mainLayout= loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	public static void showRegistro() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mechanical/registro.fxml"));
		BorderPane Registro= loader.load();
		mainLayout.setCenter(Registro);
		}
	public static void showMensaje() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("garabato/Mensaje.fxml"));
		BorderPane Mensaje= loader.load();
		mainLayout.setCenter(Mensaje);
		}
	public static void showCursos() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mechanical/Cursos.fxml"));
		BorderPane Cursos= loader.load();
		mainLayout.setCenter(Cursos);
		}
	public static void showPagos() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mechanical/Pagos.fxml"));
		BorderPane Pagos= loader.load();
		mainLayout.setCenter(Pagos);
		}
	public static void showPerfil() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mechanical/Perfil.fxml"));
		BorderPane Perfil= loader.load();
		mainLayout.setCenter(Perfil);
		}
	public static void showDebito() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mechanical/Debito.fxml"));
		BorderPane Debito= loader.load();
		mainLayout.setCenter(Debito);
		}
	public static void showCredito() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mechanical/Credito.fxml"));
		BorderPane Credito= loader.load();
		mainLayout.setCenter(Credito);
		}
	public static void showAvance() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("mechanical/Avance.fxml"));
		BorderPane Avance= loader.load();
		mainLayout.setCenter(Avance);
		}

	public static void main(String[] args) {
		launch(args);
	}
}
