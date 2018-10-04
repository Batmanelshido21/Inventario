import javax.swing.*;
import java.util.*;
public class Interfaces {

	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		
		MiMarco marco=new MiMarco();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
class MiMarco extends JFrame{
	
	public MiMarco() {
		setSize(500,300);	
		setBounds(300,300,500,300);
	}
}