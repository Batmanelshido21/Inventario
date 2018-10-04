import java.util.ArrayList;
import java.util.HashMap;

public class Pruebas {

	public static void main(String[] args) {
	ArrayList<String> arr=new ArrayList<String>();
	ArrayList<Integer> arr1=new ArrayList<Integer>();
	HashMap<String, Object> mapa=new HashMap<>();
	ArrayList arr3=new ArrayList();
	arr3.add("Hola");
	arr.add("hola");
	//int, float, char, double, boolean, short, byte, long:no cepta valores primitivos
	String a=arr.get(0);
	String b=(String)arr3.get(0);
	ArrayList<ArrayList<String>> arr4=new ArrayList<ArrayList<String>>();
	
	}
}
class Generica <E>{
	private E prop;
	public Generica(E prop) {
		this.prop=prop;
	}
}
