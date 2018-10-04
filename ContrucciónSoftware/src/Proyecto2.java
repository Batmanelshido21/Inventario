/**
 * @author javie
 *
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Proyecto2 extends JFrame implements ActionListener{
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String telefono;
	private String correo;
	private String sobreNombre;
	private String cumpleaños;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getApellidoM() {
		return apellidoM;
	}
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getSobreNombre() {
		return sobreNombre;
	}
	public void setSobreNombre(String sobreNombre) {
		this.sobreNombre = sobreNombre;
	}
	public String getCumpleaños() {
		return cumpleaños;
	}
	public void setCumpleaños(String cumpleaños) {
		this.cumpleaños = cumpleaños;
	}
	public ArrayList<Proyecto2> getContacto() {
		return contacto;
	}
	public void setContacto(ArrayList<Proyecto2> contacto) {
		this.contacto = contacto;
	}
	public Scanner getLector() {
		return lector;
	}
	public void setLector(Scanner lector) {
		this.lector = lector;
	}

	ArrayList <Proyecto2> contacto= new ArrayList<Proyecto2>();
	private static final long serialVersionUID = 1L;
Scanner lector=new Scanner(System.in);
	public Proyecto2() {
		iniciarComponentes();
		setSize(650,400);
		setTitle("Ventana Alumnos");
		setLocationRelativeTo(null);
		setVisible(true);		
		
	}
	private void iniciarComponentes(){
		
		JPanel jpanel = (JPanel) this.getContentPane();
		JPanel jpanel2 = (JPanel) this.getContentPane();
	    JTextField jtextfield = new JTextField();
	    JTextField jtextfield2 = new JTextField();
	       jtextfield.setBounds(new Rectangle(100,15,400,50));
	       jtextfield.setText("");
	       jtextfield.setEditable(false); 
	       jpanel.add(jtextfield, null);
		   setLayout(null);
		   		JButton bCerrar=new JButton("cerrar");
	    bCerrar.setText("cerrar");
		bCerrar.setBounds(100,100, 100, 25);
		add(bCerrar);
		bCerrar.addActionListener(this);
		JButton button1 = new JButton("Aceptar");
		button1.setBounds(100,150,100,25);
		add(button1);
		jtextfield.setText("Bienvenido a Contactos");
		int op,cont;
		System.out.println("Desea agregar contacto?\n1=Continuar\2=parar");
		op=lector.nextInt();
		while(op==1) {
			button1.addActionListener(new ActionListener(){
		    	   public void actionPerformed(ActionEvent e){
		    		   nombre=JOptionPane.showInputDialog(null,"Introduce el nombre");
		    		   apellidoP=JOptionPane.showInputDialog(null,"Introduce el apellido paterno");
		    		   apellidoM=JOptionPane.showInputDialog(null,"Introduce el apellido materno");
		    		   telefono=JOptionPane.showInputDialog(null,"Introduce el telefono");
		    		   correo=JOptionPane.showInputDialog(null,"Introduce el correo electronica");
		    		   sobreNombre=JOptionPane.showInputDialog(null,"Introduce el sobrenombre");
		    		   cumpleaños=JOptionPane.showInputDialog(null,"Introduce el cumpleaños");
		    	   }
		       });
			System.out.println("Desea continuar agregarndo alumonos?\\n1=Continuar\\2=parar");
			op=lector.nextInt();
		}
	}
	public static void main(String[] args) {
		new Proyecto2();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Accion del boton cerrar");
		dispose();
		
	}

}
