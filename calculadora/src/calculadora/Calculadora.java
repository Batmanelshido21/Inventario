package calculadora;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.parameterized.*;
import org.junit.runners.parameterized.*;
public class Calculadora {
	public static  int suma(int a, int b) {
		return a+b;
	}
	public static int resta(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=2;
		int res=suma(a, b);
		int esperado =5;
		if(res==esperado) {
			System.out.println("El resultado de la suma es correcto");
		}
		else {
			System.out.println("El resultado de la suma es incorrecto");
		}

	}

}
