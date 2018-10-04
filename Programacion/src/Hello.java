import java.util.*;
class Deportista{
	private int años,goles,triunfos;
	
	public int getAños() {
		return años;
	}
	public void setAños(int años) {
		this.años=años;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public int getTriunfos() {
		return triunfos;
	}
	public void setTriunfos(int triunfos) {
		this.triunfos = triunfos;
	}
}
class Futbol extends Deportista{
	private String posicion,equipo,pais;

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
public class Hello {
	public static void main(String[] args) {
	Scanner lector = new Scanner (System.in);
	
	Futbol Juan=new Futbol();
	    System.out.println("Introduce la edad de juan");
	    int años=lector.nextInt();
	    Juan.setAños(años);
	    System.out.println("Introduce el numero de goles de la temporada");
	    int goles=lector.nextInt();
	    Juan.setGoles(goles);
	    System.out.println("Introduce el numero de triunfos");
	    int triunfos=lector.nextInt();
	    Juan.setTriunfos(triunfos);
	    System.out.println("Introduce el pais de donde proviene");
	    String pais=lector.nextLine();
	    Juan.setPais(pais);
	    System.out.println("Introduce la posicion en la que juega");
	    String posicion=lector.nextLine();
	    Juan.setPosicion(posicion);
	    System.out.println("Introduce el equipo en el que juega");
	    String equipo=lector.nextLine();
	    Juan.setEquipo(equipo);
	    System.out.println("Juan tiene "+Juan.getAños()+" años, "+Juan.getTriunfos()+" triunfos, "+Juan.getGoles()+" goles, Proviene de"+Juan.getPais()+
	    		" Juega de "+Juan.getPosicion()+" y su equipo es "+Juan.getEquipo());
	    
	    
	int aux=0;
		System.out.println("Introduce el numero de elementos a evaluar");
		int num=lector.nextInt();
		int vector[]=new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("Introduce elemento");
			vector[i]=lector.nextInt();
		}
		System.out.println("Se introdujeron los elementos correctamente");
		for(int i=0;i<num;i++) {
			System.out.print("|"+vector[i]);
		}
		System.out.println("|");
		System.out.println("Entramos al hordenamiento");
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(vector[i]<vector[j]) {
				aux=vector[i];
				vector[i]=vector[j];
				vector[j]=aux;
				}
			}
		}
		System.out.println("Los elementos Ordenados quedan de la siguiente forma");
		for(int i=0;i<num;i++) {
			System.out.print("|"+vector[i]);
		}
		System.out.println("|");
		System.out.println("Y hola mundo");
		System.out.println("=====================================");
		System.out.println("Ahora vamos a hacer algo parecido con una matriz");
		System.out.println("Introduce el valor de las filas");
		int filas=lector.nextInt();
		System.out.println("Introduce el numero de columnas");
		int columnas=lector.nextInt();
		int matriz[][]=new int[filas][columnas];
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.println("Introduce valor");
				matriz[i][j]=lector.nextInt();
			}
		}
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print("|"+matriz[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("Ahora vamos a hacer un marco con 0<----");
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				if((j==0)||(i==0)||(i==filas-1)||(j==columnas-1)) {
					matriz[i][j]=0;
				}
			}
		}
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print("|"+matriz[i][j]);
			}
			System.out.println("|");
		}
	}
}