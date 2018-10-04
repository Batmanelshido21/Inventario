package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App{
	private Stage primaryStage;
	private BorderPane mainLayout;

	public static void main(String[] args) {
		
		JFileChooser jf = new JFileChooser();
		jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
		jf.setMultiSelectionEnabled(false);
		int returnSelection=jf.showOpenDialog(null);
		if(returnSelection==JFileChooser.APPROVE_OPTION) {
			System.out.println(jf.getSelectedFile().getAbsolutePath());
		}
		try {
		    Process proceso = Runtime.getRuntime().exec("cmd /c dir");
		    BufferedReader stdInput = new
			BufferedReader(new InputStreamReader(proceso.getInputStream()));
		    // leer línea por línea de la salida del comando
		    String linea;
		    while ((linea = stdInput.readLine()) != null) {
	                System.out.println(linea);
	            }
		} catch (IOException error) {
		    error.printStackTrace();
		}
	}
}
