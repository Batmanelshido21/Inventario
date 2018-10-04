import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class PruebaTexto {

	public static void main(String[] args) {
		MarcoTexto mimarco= new MarcoTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoTexto extends JFrame{
	public MarcoTexto() {
		setBounds(600,300,600,350);
		LaminaTexto milamina = new LaminaTexto();
		add(milamina);
		setVisible(true);
		setTitle("Contactos");
	}
}
class Contacto{
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String telefono;
	private String fechaNacimiento;
	private String sobreNombre;
	
	public Contacto(String nombre, String apellidoP, String apellidoM, String telefono, String fechaNacimiento,
			String sobreNombre) {
		super();
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.sobreNombre = sobreNombre;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", telefono="
				+ telefono + ", fechaNacimiento=" + fechaNacimiento + ", sobreNombre=" + sobreNombre + "]";
	}
	
}
class LaminaTexto extends JPanel {
	String nombre,apellidoP,apellidoM,telefono,fechaNacimiento,sobreNombre;
	ArrayList <Contacto> contacto= new ArrayList<Contacto>();
	int cont=1;
	public LaminaTexto() {
		JTextField campo=new JTextField("bienvenido a la agenda",50);
		add(campo);
		campo.setEditable(false);
		JTextField campo11=new JTextField("Nombre",50);
		add(campo11);
		campo11.setEditable(false);
		JTextField campo1=new JTextField(50);
		add(campo1);
		JTextField campo33=new JTextField("apellidp paterno",50);
		add(campo33);
		campo33.setEditable(false);
		JTextField campo3=new JTextField(50);
		add(campo3);
		JTextField campo44=new JTextField("apellido materno",50);
		add(campo44);
		campo44.setEditable(false);
		JTextField campo4=new JTextField(50);
		add(campo4);
		JTextField campo55=new JTextField("telefono",50);
		add(campo55);
		campo55.setEditable(false);
		JTextField campo5=new JTextField(50);
		add(campo5);
		JTextField campo66=new JTextField("fecha de nacimiento",50);
		add(campo66);
		campo66.setEditable(false);
		JTextField campo6=new JTextField(50);
		add(campo6);
		JTextField campo77=new JTextField("sobrenombre",50);
		add(campo77);
		campo77.setEditable(false);
		JTextField campo7=new JTextField(50);
		add(campo7);
		JButton button1 = new JButton("Aceptar");
		button1.setBounds(100,150,100,25);
		add(button1);
		JButton button2= new JButton("Guardar");
		button2.setBounds(200,150,200,15);
		add(button2);
		JButton button3 = new JButton("Consultar");
		button3.setBounds(100,150,100,25);
		add(button3);
		JTextField campo2=new JTextField(50);
		add(campo2);
		campo2.setEditable(false);
			button1.addActionListener(new ActionListener(){
		    	   public void actionPerformed(ActionEvent e){
		    		  if((!campo1.getText().equals(""))&&(!campo3.getText().equals(""))&&(!campo4.getText().equals(""))
		    				  &&(!campo5.getText().equals("")) &&(!campo6.getText().equals(""))&&(!campo7.getText().equals("")) ){
		    			  nombre=campo1.getText();
			    		   campo1.setText("");
			    		   apellidoP=campo3.getText();
			    		   campo3.setText("");
			    		   apellidoM=campo4.getText();
			    		   campo4.setText("");
			    		   telefono=campo5.getText();
			    		   campo5.setText("");
			    		   fechaNacimiento=campo6.getText();
			    		   campo6.setText("");
			    		   sobreNombre=campo7.getText();
			    		   campo7.setText("");
			    	contacto.add(new Contacto(nombre,apellidoP,apellidoM,telefono,fechaNacimiento,sobreNombre));
			    	campo2.setText("Numero de personas agregadas: "+cont);
			    	cont++;
		    		  }
		    		  else {
		    			  campo2.setText("Agrega la persona antes de hacer click en Aceptar");
		    		  }
		    	   }
		       });
			button2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					Iterator<Contacto> iterador=contacto.iterator();
					while(iterador.hasNext()) {
						System.out.println(iterador.next().toString());
					}					
				}
			});
}
}