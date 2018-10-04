package calculadora;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
class CalculadoraParametroTest {
	private int a,b,exp;
	
	public CalculadoraParametroTest(int a,int b ,int exp) {
		this.a=a;
		this.b=b;
		this.exp=exp;
	}
	@Test
	public void testAdd() {
		CalculadoraBefoAlf calc=new CalculadoraBefoAlf();
		int resul=calc.add(a,b);
		assertEquals(exp,resul);
		}

}
