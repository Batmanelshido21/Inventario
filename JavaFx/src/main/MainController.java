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
  
  /**
   * Este metodo se encarga de tomar la ruta del programa e introducirla en el TextField.
   * y toma un valor string con la dirección obtenida.
   * @param event al presionar el boton analizar.
   */
    
  @FXML
  void analizarM(ActionEvent event) {
    salida.appendText("");
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

  /**
   * Este metodo obtiene los porgramas para evaluar codigo y regresa los errores encontrados.
   * dentro de el.
   * @param event Al utilizar el boton Examinar.
   */
  
  @FXML
  void examinarM(ActionEvent event) {
    JFileChooser jf = new JFileChooser();
    jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
    jf.setMultiSelectionEnabled(false);
    int returnSelection = jf.showOpenDialog(null);
    if (returnSelection == JFileChooser.APPROVE_OPTION) {
      System.out.println(jf.getSelectedFile().getAbsolutePath());
      direccion.setText(jf.getSelectedFile().getAbsolutePath());
      direc = jf.getSelectedFile().getAbsolutePath();
    }
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }
}