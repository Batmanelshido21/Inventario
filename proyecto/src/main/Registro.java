package main;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Registro implements Initializable{
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	  @FXML
	    private TextField inputApellidoPaterno;

	    @FXML
	    private TextField inputNombre;

	    @FXML
	    private TextField inputApellidoMAterno;

	    @FXML
	    private TextField inputEmail;

	    @FXML
	    private TextField inputCURP;

	    @FXML
	    private Button continuar;

	    @FXML
	    private Button cancelar;

	    @FXML
	    void terminado(ActionEvent event) {

	    }

	    @FXML
	    void volver(ActionEvent event) {

	    }

}
