import java.util.ArrayList;

class Nodo <E>{
	protected E val;
	private Nodo<E> siguiente;
	
	public Nodo setSiguiente(Nodo<E> siguiente) {
		return this.siguiente = siguiente;
	}
	
}
class Lista <E> extends Nodo{
	private Nodo<E>frente;
	
	public Lista(E val) {
		frente=null;
		
	}
	@SuppressWarnings("unchecked")
	public void append(E val) {
	
			
	}
	public void delete(int index) {
		
	}
	E get(int index) {
		return null;
		
	}
}
public class ListaLigada <E>{

	public static void main(String[] args) {
	String algo="Algo";
	algo=algo.substring(1,3);
	System.out.println(algo);

	}

}
