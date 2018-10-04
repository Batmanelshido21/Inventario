package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JFileChooser;

public class MainController implements Initializable {

  String direc;

  @FXML
  private Button examinar;

  @FXML
  private Button analizar;

  @FXML
  private TextField direccion;
    
  @FXML
  private TextArea salida;
    
  @FXML
  void analizarM(ActionEvent event) {
    try {
      Process proceso = Runtime.getRuntime().exec("cmd.exe /C java -jar checkstyle-8.2-all.jar"
          + " -c google_checks.xml " + direc);
      BufferedReader stdInput = new
          BufferedReader(new InputStreamReader(proceso.getInputStream()));
      String linea;
      while ((linea = stdInput.readLine()) != null) {
        System.out.println(linea);
        salida.appendText(linea + "\n");
      }
    } catch (IOException error) {
      error.printStackTrace();
    }
  }

  @FXML
  void examinarM(ActionEvent event) {
    JFileChooser jf = new JFileChooser();
    jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
    jf.setMultiSelectionEnabled(false);
    int returnSelection = jf.showOpenDialog(null);
    if (returnSelection == JFileChooser.APPROVE_OPTION) {
      System.out.println(jf.getSelectedFile().getAbsolutePath());
    }
    
    direccion.setText(jf.getSelectedFile().getAbsolutePath());
    direc = jf.getSelectedFile().getAbsolutePath();
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }
}