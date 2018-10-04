package calculadora;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class CalculadoraBefoAlfTest {
static CalculadoraBefoAlf calc;

    @Before
    public void before() {
    	System.out.println("Before() ");
    	calc.clear();
    }
	@Test
	public void testSum() {
		System.out.println("testSum() ");
		int resul=calc.add(3,2);
		int esper=5;
		assertEquals(esper,resul);
	}
	@Test
	public void testAnsSum() {
		System.out.println("AnsSum() ");
		calc.add(3,2);
		int resul=calc.ans();
		int esper=5;
		assertEquals(esper,resul);
	}
	@After
	public void after() {
		System.out.println("After()");
		calc.clear();
	}
	@Test
	public void div() {
		calc.div(5,2);
	}
	//@Test(expected = ArithmeticException.class)
	public void testDivPorCero() {
		calc.div(5,0);
	}
	/*@Test(timeout=2001)
	public void testAlgoritmoOptimo() {
		calc.operationOptima();
	}
	*/
	@BeforeClass
	public static void beforeclass() {
		System.out.println("BeforeClass");
		calc=new CalculadoraBefoAlf();
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}

}
