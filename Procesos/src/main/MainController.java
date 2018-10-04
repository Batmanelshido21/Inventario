package main;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainController implements Initializable{
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	@FXML
    private StackPane rootPane;

    @FXML
    private TextField tf_Usuario;

    @FXML
    private Button btn_Login;

    @FXML
    private PasswordField pf_Contrasenia;

    @FXML
    private Button btnregistro;

    @FXML
    void ingresar(ActionEvent event) {

    }
   
    @FXML
    private Button continuar;

    @FXML
    private Button cancelar;

    @FXML
    private Label mensaje;

    @FXML
    void terminado(ActionEvent event) {

    }

    @FXML
    void volver(ActionEvent event) {

    }

    @FXML
    void registro(ActionEvent event) throws IOException {
    	  Parent parent = FXMLLoader.load(getClass().getResource("/fxml/Registro.fxml"));
     		Stage stage1 = new Stage();
     		Scene scene2 = new Scene(parent);	
     		stage1.setScene(scene2);
     		stage1.setTitle("Registro");
     		stage1.show();	   		

    }
	   

	  
}

