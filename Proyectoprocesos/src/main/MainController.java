package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainController implements Initializable{
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	public class LoginController {

	    @FXML
	    private StackPane rootPane;

	    @FXML
	    private TextField tf_Usuario;

	    @FXML
	    private Button btn_Login;

	    @FXML
	    private PasswordField pf_Contrasenia;

	    @FXML
	    private AnchorPane inputApellidoPaterno;

	    @FXML
	    private TextField inputNombre;

	    @FXML
	    private TextField inputApellidoMAterno;

	    @FXML
	    private TextField inputEmail;

	    @FXML
	    private TextField inputCURP;

	    	@FXML
    	    private void ingresar(ActionEvent event) {
    	        
    	        }
	    	
	    	  @FXML
	    	    void registro(ActionEvent event) {
	    		Parent parent;
				try {
					parent = FXMLLoader.load(getClass().getResource("/fxml/Registro.fxml"));
					Stage stage1 = new Stage();
		  	   		Scene scene2 = new Scene(parent);	
		  	   		stage1.setScene(scene2);
		  	   		stage1.setTitle("Ventana 2");
		  	   		stage1.show();	
		  	   		
		  	   		
		  	   		
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}   		

	    	    }

	    }

	}
	   
	       
		
	    
	    


