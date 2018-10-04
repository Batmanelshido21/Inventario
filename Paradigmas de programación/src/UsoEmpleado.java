import java.util.*;
class Empleado{
	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}
	
}
public class UsoEmpleado {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		/*Empleado listaEmpleado[]=new Empleado[3];
		listaEmpleado[0]=new Empleado("Ana",23,4000);
		listaEmpleado[1]=new Empleado("Javier",22,40000);
		listaEmpleado[2]=new Empleado("Alguien",23,400);
		*/
		ArrayList <Empleado> listaEmpleado= new ArrayList<Empleado>();
		listaEmpleado.add(new Empleado("Ana",23,4000));
		listaEmpleado.add(new Empleado("Javier",22,40000));
		listaEmpleado.add(new Empleado("Alguien",23,400));
		listaEmpleado.add(new Empleado("AnaClone",23,4000));
		listaEmpleado.add(new Empleado("Juan",23,4000));
		listaEmpleado.add(new Empleado("Enrique",23,4000));
		listaEmpleado.add(new Empleado("Edali",23,4000));
		listaEmpleado.add(new Empleado("Aldo",23,4000));
		listaEmpleado.add(new Empleado("Hector",23,4000));
		listaEmpleado.add(new Empleado("Ricardo",23,4000));
		listaEmpleado.add(new Empleado("Angel",23,4000));
		listaEmpleado.add(new Empleado("Manuel",23,4000));
		listaEmpleado.set(1,new Empleado("olga",22,4567));
		System.out.println(listaEmpleado.get(4));
		System.out.println(listaEmpleado.size());
		/*for(Empleado e: listaEmpleado) {
			System.out.println(e.toString());
		}
		*/
		/*for(int i=0;i<listaEmpleado.size();i++) {
			Empleado e=listaEmpleado.get(i);
			System.out.println(e.toString());
					
		}*/
		//La forma de pasar los ArrayList a un arreghlo de objetos convencional es:
		/*Empleado arrayEmpleados[]=new Empleado[listaEmpleado.size()];
		listaEmpleado.toArray(arrayEmpleados);
		for(int i=0;i<arrayEmpleados.length;i++) {
			System.out.println(arrayEmpleados[i].toString());
		}
		*/
		Iterator<Empleado> iterador=listaEmpleado.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next().toString());
		}
	}

}
