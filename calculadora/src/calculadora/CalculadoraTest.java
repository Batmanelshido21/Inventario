package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class CalculadoraTest {

	@Test
	public void testSuma() {
		int resultado=Calculadora.suma(2, 3);
		int esperado=5;
		assertEquals(resultado,esperado);
	}
	@Test
	public void testResta() {
		int resultado=Calculadora.resta(3,2);
		int esperado=1;
		assertEquals(resultado,esperado);
				}
}
