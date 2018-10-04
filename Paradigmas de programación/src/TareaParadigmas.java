import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class TareaParadigmas {
    private static final ArrayList<Fraccion> fracciones = new ArrayList<>();

    public static void main(String[] args) {
      
        Random numeroAleatorio = new Random();
        Scanner lector= new Scanner (System.in);
        //Genera fracciones aleatorias
        //Numerador tiene rango de 0 a 100
        //Denominador tiene rango de 1 a 100
        for(int x=0; x<10; x++){
            int numerador = numeroAleatorio.nextInt((100 - 0) + 1) + 0;
            int denominador = numeroAleatorio.nextInt((100 - 1) + 1) + 1;
            fracciones.add(new Fraccion(numerador, denominador ));
        }
        
        //imprime fracciones del ArrayList
        for(int x=0; x<10; x++){
        	System.out.println("Fracion numero: "+(x+1));
            System.out.println(fracciones.get(x).getNumerador() + "/" + fracciones.get(x).getDenominador());
            System.out.println("");
        }
        
        System.out.println("");
        
        //Comparando fracciones de ArrayList 
        //Fraccion posicion 0 con fraccion posicion 1
      System.out.println("Introduce el numero de las fracciones a evaluar");
      System.out.println("fracción 1");
      int num1=lector.nextInt();
      System.out.println("Introduce el numero 2");
      int num2=lector.nextInt();
    	  for(int i=0;i<10;i++) {
        	  for(int j=0;j<10;j++) {
        		  if((num1==i)&&(num2==j)) {
        			  System.out.println(fracciones.get(i).compareTo(fracciones.get(j)));
        		  }
        	  }
          }
    	  System.out.println("Equals");
    	  if(fracciones.get(0).equals(fracciones.get(1))) {
    		  System.out.println("Son iguales");
    	  }
    	  else {
    		  System.out.println("Son diferentes");
    	  }
      System.out.println(fracciones.hashCode());
    }
}

 class Fraccion implements Comparable<Fraccion> {
    
    private int numerador;
    private int denominador;
    
    public Fraccion(int num, int den){
            numerador=num;
            denominador=den;
    }
    
    public void setNumerador(int numerador){
        this.numerador=numerador;
    }
    
    public int getNumerador(){
        return numerador;
    }
    
    public void setDenominador(int denominador){
        this.denominador=denominador;
    }
    
    public int getDenominador(){
        return denominador;
    }

    @Override
    public int compareTo(Fraccion fraccion) {
        int resultado = 0;
        float fraccionOriginal=(this.numerador)/(this.denominador);
        float fraccionArgumentos=(fraccion.numerador)/(fraccion.denominador);
        if((fraccionOriginal) < (fraccionArgumentos)){
            resultado= -1;
        }
        else if((fraccionOriginal) > (fraccionArgumentos)){
            resultado= 1;
        }
        else {
            resultado= 0;
        }
        return resultado;
    }
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraccion other = (Fraccion) obj;
		if (denominador != other.denominador)
			return false;
		if (numerador != other.numerador)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominador;
		result = prime * result + numerador;
		return result;
	}
}
