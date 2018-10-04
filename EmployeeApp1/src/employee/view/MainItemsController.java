package employee.view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import employee.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
public class MainItemsController implements Initializable {
	public static final String URL = "jdbc:mysql://localhost:3306/proyectoprocesos";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "batman";
	public static Connection getConection(){
	    Connection co=null;
	    try{
	        Class.forName("com.mysql.jdbc.Driver");
	          co = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	          Statement stm=co.createStatement();
	          System.out.println("Se genero correctamente la base de datos");
	    }
	    catch(Exception e){
	        System.out.println("Error");
	    }
	    return  co;
	}
	 private Connection ConexionBD;
	   PreparedStatement ps;
	   ResultSet rs;
	private Main main;
	/////////////////////////////////Login///////////////////////////////////////////////////////
	@FXML
    private PasswordField inputContraseña;

    @FXML
    private TextField inputCorreo;
  String correo2, contraseña2; 

    @FXML
    void ingresar(ActionEvent event) throws IOException {
    	Connection co=null;
    try {
    	co= getConection();
    	ps= co.prepareStatement("select * from cliente where contraseña = ?");
    	ps.setString(1,inputContraseña.getText());
    	rs= ps.executeQuery();
    	if(rs.next()) {
    		nombres=rs.getString("nombres");
    		System.out.println(nombres);
    		Apaterno=rs.getString("apellidoPaterno");
    		System.out.println(Apaterno);
    		Amaterno=rs.getString("apellidoMaterno");
    		System.out.println(Amaterno);
    		curp=rs.getString("CURP");
    		System.out.println(curp);
    		fecha=rs.getString("fecha");
    		System.out.println(fecha);
    		genero=rs.getString("genero");
    		System.out.println(genero);
    		email=rs.getString("Email");
    		correo2=email;
    		contraseña2=inputContraseña.getText();
    		
    	}   	
    	}
    catch(Exception e) {
    	
    }
    	if(email.equals(inputCorreo.getText())) {
    		main.showPerfil(); 	
    	}
    }
    @FXML
    void registro(ActionEvent event) throws IOException {
    	main.showAvance();

    }
    /////////////////////////////Perfil/////////////////////////////////////////////////////////
    @FXML
    private TextField nombreComp;

    @FXML
    private TextField correo;

    @FXML
    private TextField fechaNacimiento;

    @FXML
    private TextField Genero;

    @FXML
    private TextField Curp;
    
    @FXML
    private TextField inputcorreo;

    @FXML
    private PasswordField inputcontraseña;
    @FXML
    void cargar(ActionEvent event) {
    	Connection co=null;
        try {
        	co= getConection();
        	ps= co.prepareStatement("select * from cliente where contraseña = ?");
        	ps.setString(1,inputcontraseña.getText());
        	rs= ps.executeQuery();
        	if(rs.next()) {
        		nombreComp.setText(rs.getString("nombres")+" "+rs.getString("apellidoPaterno")+" "+rs.getString("apellidoMaterno"));
        		fechaNacimiento.setText(rs.getString("fecha"));
        		Genero.setText(rs.getString("genero"));
        		Curp.setText(rs.getString("CURP"));
        	}   	
        	}
        catch(Exception e) {
        	
        }
    }

	//////////////////////////////Registro///////////////////////////////////////////////////////
    @FXML
    private DatePicker inputFecha;

    @FXML
    private TextField inputNombre;

    @FXML
    private TextField inputApellidoPaterno;

    @FXML
    private TextField inputApellidoMaterno;

    @FXML
    private TextField inputEmail;

    @FXML
    private TextField inputCURP;
    @FXML
    private TextField inputContrasena;


    @FXML
    private Button continuar;

    @FXML
    private Button cancelar;

    @FXML
    private TextField inputGenero;
    String nombres,Apaterno,Amaterno,curp,email,fecha,genero;
    

    @FXML
    void registrar(ActionEvent event) throws IOException {
    	Connection co =null;
    	String date = inputFecha.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
      try{
         co=getConection();
       ps=co.prepareStatement("INSERT INTO cliente(nombres, apellidoPaterno, apellidoMaterno, CURP, Email, fecha, genero,contraseña) VALUES(?,?,?,?,?,?,?,?)");
       ps.setString(1, inputNombre.getText());
               ps.setString(2, inputApellidoPaterno.getText());
               ps.setString(3,inputApellidoMaterno.getText());
               ps.setString(4,inputCURP.getText());
               ps.setString(5,inputEmail.getText());
               ps.setString(6,date);
               ps.setString(7,inputGenero.getText());
               ps.setString(8,inputContrasena.getText());
               
                  int res = ps.executeUpdate();
                  
                  if(res>0){
                      System.out.println("Materia guardada");
                  }
                  else{
                      System.out.println("Error al guardar la materia");
                  }
                  
                  co.close();
      }
      catch(Exception e){
          System.out.println("Error");
      }
    	main.showCursos();

    }

    @FXML
    void volver(ActionEvent event) throws IOException {
    	main.showMainView();

    }
/////////////////////////////////////////////////Cursos///////////////////////////////////////////////////
    @FXML
    private CheckBox arte;

    @FXML
    private CheckBox futbol;

    @FXML
    private CheckBox alimentación;

    @FXML
    private CheckBox negocios;

    @FXML
    private CheckBox matematicas;

    @FXML
    private CheckBox Español;

    @FXML
    private CheckBox historia;

    @FXML
    private CheckBox basket;

    @FXML
    private CheckBox ciclismo;

    @FXML
    private CheckBox tenis;

    @FXML
    private CheckBox habitos;

    @FXML
    private CheckBox meditacion;
    @FXML
    private Label mensaje;
    int pago;
    @FXML
    void cotizar(ActionEvent event) {
    	 pago = 0;
    	if(arte.isSelected()) {
    		pago=pago+500;
    	}
    	if(futbol.isSelected()) {
    		pago=pago+500;
    	}
    	if(alimentación.isSelected()) {
    		pago=pago+500;
    	}
    	if(negocios.isSelected()) {
    		pago=pago+500;
    	}if(matematicas.isSelected()) {
    		pago=pago+500;
    	}
    	if(Español.isSelected()) {
    		pago=pago+500;
    	}
    	if(historia.isSelected()) {
    		pago=pago+500;
    	}
    	if(basket.isSelected()) {
    		pago=pago+500;
    	}
    	if(ciclismo.isSelected()) {
    		pago=pago+500;
    	}
    	if(tenis.isSelected()) {
    		pago=pago+500;
    	}
    	if(habitos.isSelected()) {
    		pago=pago+500;
    	}
    	if(meditacion.isSelected()) {
    		pago=pago+500;
    	}
    	String msn ="Total: "+pago;
    	mensaje.setText(msn);
    }

    @FXML
    void metodopago(ActionEvent event) throws IOException {
    	main.showPagos();

    }

    @FXML
    void volverRegistro(ActionEvent event) throws IOException {
    	main.showRegistro();

    }
    @FXML
    void volverpago(ActionEvent event) throws IOException {
    	main.showPagos();

    }
//////////////////////////////////////////////////////////////Metodo de pago/////////////////////////////////////////////////

    @FXML
    void credito(ActionEvent event) throws IOException {
    	main.showCredito();

    }

    @FXML
    void debito(ActionEvent event) throws IOException {
    	main.showDebito();

    }

    @FXML
    void pago(ActionEvent event) throws IOException {
    	main.showMensaje();

    }
    @FXML
    void volverCursos(ActionEvent event) throws IOException {
    	main.showCursos();

    }
//////////////////////////////////////////////////////////////Deposito/////////////////////////////////////////////////////////
    @FXML
    private TextField numeroCuenta;

    @FXML
    private TextField folio;
    int foliocont=100;
    @FXML
    void obtenercuenta(ActionEvent event) throws IOException {
    	numeroCuenta.setText("353456654");
    	int Folio=0, n=100;
    	Folio = (int) (Math.random() * n) + 1;
    	System.out.println(Folio);
    	Folio=100+Folio;
    	String folio1="";
    	folio1=String.valueOf(Folio);
    	folio.setText(folio1);	
    }
    @FXML
    void volverlogin(ActionEvent event) throws IOException {
    	main.showMainView();

    }
	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}   
}