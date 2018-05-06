import org.junit.*;
import io.Polinomio;

public class PolinomioTests {
	
	@Test
	public void multicacionSucesiva() {
		double[]coeficientes = {2,3,5,0};
		Polinomio polinomio = new Polinomio(3, coeficientes);
		System.out.println("sucesiva" + polinomio.evaluarMSucesivas(3));

		Assert.assertEquals(96, polinomio.evaluarMSucesivas(3), 0);
	}

	@Test
	public void recursividad() {
		double[]coeficientes = {2,3,5,0};
		Polinomio polinomio = new Polinomio(3, coeficientes);
		System.out.println("recursiva" + polinomio.evaluarRecursiva(3));
		Assert.assertEquals(96,  polinomio.evaluarRecursiva(3) , 0);
	}
	
	@Test
	public void programacionDinamica() {
		double[]coeficientes = {2,3,5,0};
		Polinomio polinomio = new Polinomio(3, coeficientes);
		System.out.println("ProgDinamica" + polinomio.evaluarProgDinamica(3));
		Assert.assertEquals(96, polinomio.evaluarProgDinamica(3), 0);
	}
	
	@Test
	public void evaluarHorner() {
		double[]coeficientes = {2,3,5,0};
		Polinomio polinomio = new Polinomio(3, coeficientes);
		System.out.println("Horner" + polinomio.evaluarHorner(3));
		Assert.assertEquals(96, polinomio.evaluarHorner(3), 0);
	}

}
