package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController implements Initializable {

  @FXML
  private TextField nameInput;

  @FXML
  private TextField pesoInput;

  @FXML
  private TextField precioInput;

  @FXML
  private TextField existeInput;

  @FXML
  private Button guardar;
    
  @FXML
  private Label mensaje;

  @FXML
  private TextField marcaInput;

  @FXML
  private TextArea vistInput;

  @FXML
  private Button mostrar;
  
  String ruta = "C:\\Users\\javie\\eclipse-workspace\\JavaFx2\\archivo.txt";
  File archivo = new File(ruta);
  BufferedWriter bw = null;

  /**
   * Este metodo se encarga de guardar el producto en un archvivo txt.
   * Verifica que los campos sean llenados correctamente.
   * Crea el archivo en caso de que no exista.
   * Introduce nuevo texto en caso de que exista el archivo.
   * @param event al presionar el boton guardar.
   */
  
  @FXML
    void guardarProducto(ActionEvent event) {
    vistInput.setText("");
    if ((!nameInput.getText().equals("")) && (!pesoInput.getText().equals("")) 
        && (!precioInput.getText().equals("")) && (!existeInput.getText().equals(""))) {
      mensaje.setText("Datos registrados correctamente");
      try {
        if (archivo.exists()) {
          try (FileWriter fw = new FileWriter("archivo.txt", true);
              BufferedWriter bw = new BufferedWriter(fw);
              PrintWriter out = new PrintWriter(bw)) {
            out.println("-----");
            out.println("nombre: " + nameInput.getText());
            out.println("peso: " + pesoInput.getText());
            out.println("precio: " + precioInput.getText());
            out.println("existencia: " + existeInput.getText());
            out.println("Marca: " + marcaInput.getText());
          } catch (IOException e) {
            System.out.println("Error");
          }
        } else {
          bw = new BufferedWriter(new FileWriter(archivo));
          bw.write("nombre: " + nameInput.getText());
          bw.newLine();
          bw.write("peso: " + pesoInput.getText());
          bw.newLine();
          bw.write("precio: " + precioInput.getText());
          bw.newLine();
          bw.write("existencia: " + existeInput.getText());
          bw.newLine();
          bw.write("Marca: " + marcaInput.getText());
          bw.newLine();
          bw.close();
        } 
      } catch (Exception exception) {
        System.out.println("Error");
      }  
    } else {
      mensaje.setText("Los campos no fueron llenados correctamente");

    }
    nameInput.setText("");
    precioInput.setText("");
    pesoInput.setText("");
    existeInput.setText("");
    marcaInput.setText("");
  }

  /**
   * Este metodo se encarga de mostrar el texto del archivo solicitado.
   * Y lo imprime dentro de un TextArea.
   * En caso de que se consulte un archivo no creado el sistema muestra el mensaje.
   * "No se ha creado ningún archivo".
   * @param event al presionar el boton mostrar.
   */
  
  @FXML
    void mostrarVista(ActionEvent event) throws IOException {
    if (archivo.exists()) {
      vistInput.setText("");
      String cadena;
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      while ((cadena = b.readLine()) != null) {
        vistInput.appendText(cadena + "\n");
      }
      b.close();
    } else {
      mensaje.setText("No se ha creado ningún archivo");
    }

  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }
}