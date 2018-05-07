import org.junit.*;
import io.Polinomio;

public class PolinomioTests {
	
	@Test
	public void multicacionSucesivaGrado3() {
		double[]coeficientes = {2,-3,5,0};
		Polinomio polinomio = new Polinomio(3, coeficientes);
		//System.out.println("Multiplicacion Sucesiva Grado 3 " + polinomio.evaluarMSucesivas(3));
		Assert.assertEquals(42, polinomio.evaluarMSucesivas(3), 0);
	}
	
	@Test
	public void multicacionSucesivaGrado6() {
		double[]coeficientes = {-5,3,0,-2,7,3,0};
		Polinomio polinomio = new Polinomio(6, coeficientes);
		//System.out.println("Multiplicacion Sucesiva Grado 6 " + polinomio.evaluarMSucesivas(3));
		Assert.assertEquals(-2898, polinomio.evaluarMSucesivas(3), 0);
	}
	
	@Test
	public void multicacionSucesivaGrado0() {
		double[]coeficientes = {5};
		Polinomio polinomio = new Polinomio(0, coeficientes);
		//System.out.println("Multiplicacion Sucesiva Grado 0 " + polinomio.evaluarMSucesivas(5));

		Assert.assertEquals(5, polinomio.evaluarMSucesivas(5), 0);
	}
	
	@Test
	public void multicacionSucesivaGrado1() {
		double[]coeficientes = {3,5};
		Polinomio polinomio = new Polinomio(1, coeficientes);
		//System.out.println("Multiplicacion Sucesiva Grado 1 " + polinomio.evaluarMSucesivas(2));

		Assert.assertEquals(11, polinomio.evaluarMSucesivas(2), 0);
	}

//	@Test
//	public void recursivoGrado3() {
//		double[]coeficientes = {1,1,1,0};//{2,-3,5,0};
//		Polinomio polinomio = new Polinomio(3, coeficientes);
////		System.out.println("Recursiva Grado 3 " + polinomio.evaluarRecursiva(2));
//		Assert.assertEquals(14,  polinomio.evaluarRecursiva(2) , 0);
//	}
//
//
//	@Test
//	public void recursivoGrado6() {
//		double[]coeficientes = {-5,3,0,-2,7,3,0};
//		Polinomio polinomio = new Polinomio(6, coeficientes);
////		System.out.println("Multiplicacion Sucesiva Grado 6 " + polinomio.evaluarRecursiva(3));
//		Assert.assertEquals(-2898, polinomio.evaluarRecursiva(3), 0);
//	}	
//	@Test
//	public void recursivoGrado0() {
//		double[]coeficientes = {2};
//		Polinomio polinomio = new Polinomio(0, coeficientes);
////		System.out.println("Recursiva Grado 0 " + polinomio.evaluarRecursiva(2));
//		Assert.assertEquals(2, polinomio.evaluarRecursiva(2), 0);
//	}
//	
//	@Test
//	public void recursivoGrado1() {
//		double[]coeficientes = {2,3};
//		Polinomio polinomio = new Polinomio(1, coeficientes);
////		System.out.println("Recursiva Grado 1 " + polinomio.evaluarRecursiva(2));
//		Assert.assertEquals(7, polinomio.evaluarRecursiva(2), 0);
//	}


	@Test
	public void recursivoParImparGrado3() {
		double[]coeficientes = {1,1,1,0};//{2,-3,5,0};
		Polinomio polinomio = new Polinomio(3, coeficientes);
		System.out.println("Recursiva Par o Impar Grado 3 " + polinomio.evaluarRecursivaParImpar(2));
		Assert.assertEquals(14,  polinomio.evaluarRecursivaParImpar(2) , 0);
	}

	@Test
	public void recursivoParImparGrado6() {
		double[]coeficientes = {-5,3,0,-2,7,3,0};
		Polinomio polinomio = new Polinomio(6, coeficientes);
		System.out.println("Recursiva Par o Impar Grado 6 " + polinomio.evaluarRecursivaParImpar(3));
		Assert.assertEquals(-2898, polinomio.evaluarRecursivaParImpar(3), 0);
	}	

	@Test
	public void recursivoParImparGrado0() {
		double[]coeficientes = {2};
		Polinomio polinomio = new Polinomio(0, coeficientes);
		System.out.println("Recursiva Par o Impar Grado 0 " + polinomio.evaluarRecursivaParImpar(2));
		Assert.assertEquals(2, polinomio.evaluarRecursivaParImpar(2), 0);
	}
	
	@Test
	public void recursivoParImparGrado1() {
		double[]coeficientes = {2,3};
		Polinomio polinomio = new Polinomio(1, coeficientes);
		System.out.println("Recursiva Par o Impar Grado 1 " + polinomio.evaluarRecursivaParImpar(2));
		Assert.assertEquals(7, polinomio.evaluarRecursivaParImpar(2), 0);
	}	
	
	
	@Test
	public void programacionDinamicaGrado3() {
		double[]coeficientes = {2,-3,5,0};
		Polinomio polinomio = new Polinomio(3, coeficientes);
		//System.out.println("Programacion Dinamica Grado 3 " + polinomio.evaluarProgDinamica(3));
		Assert.assertEquals(42, polinomio.evaluarProgDinamica(3), 0);
	}

	@Test
	public void programacionDinamicaGrado6() {
		double[]coeficientes = {-5,3,0,-2,7,3,0};
		Polinomio polinomio = new Polinomio(6, coeficientes);
		//System.out.println("Programacion Dinamica Grado 6 " + polinomio.evaluarProgDinamica(3));
		Assert.assertEquals(-2898, polinomio.evaluarProgDinamica(3), 0);
	}
	
	@Test
	public void programacionDinamicaGrado0() {
		double[]coeficientes = {2};
		Polinomio polinomio = new Polinomio(0, coeficientes);
		//System.out.println("Programacion Dinamica Grado 0 " + polinomio.evaluarProgDinamica(2));
		Assert.assertEquals(2, polinomio.evaluarProgDinamica(2), 0);
	}
	
	@Test
	public void programacionDinamicaGrado1() {
		double[]coeficientes = {2,3};
		Polinomio polinomio = new Polinomio(1, coeficientes);
		//System.out.println("Programacion Dinamica Grado 1 " + polinomio.evaluarProgDinamica(2));
		Assert.assertEquals(7, polinomio.evaluarProgDinamica(2), 0);
	}
	
	@Test
	public void mejoradaGrado3() {
		double[]coeficientes = {2,-3,5,0};
		Polinomio polinomio = new Polinomio(3, coeficientes);
		//System.out.println("Mejorada Grado 3 " + polinomio.evaluarMejorada(3));
		Assert.assertEquals(42, polinomio.evaluarMejorada(3), 0);
	}
	
	@Test
	public void mejoradaGrado6() {
		double[]coeficientes = {-5,3,0,-2,7,3,0};
		Polinomio polinomio = new Polinomio(6, coeficientes);
		//System.out.println("Mejorada Grado 6 " + polinomio.evaluarMejorada(3));
		Assert.assertEquals(-2898, polinomio.evaluarMejorada(3), 0);
	}	
	
	
	@Test
	public void mejoradaGrado0() {
		double[]coeficientes = {2};
		Polinomio polinomio = new Polinomio(0, coeficientes);
		//System.out.println("Mejorada Grado 0 " + polinomio.evaluarMejorada(2));
		Assert.assertEquals(2, polinomio.evaluarMejorada(2), 0);
	}
	
	@Test
	public void mejoradaGrado1() {
		double[]coeficientes = {2,3};
		Polinomio polinomio = new Polinomio(1, coeficientes);
		//System.out.println("Mejorada Grado 1 " + polinomio.evaluarMejorada(2));
		Assert.assertEquals(7, polinomio.evaluarMejorada(2), 0);
	}	
	
	@Test
	public void evaluarPowGrado3() {
		double[]coeficientes = {2,-3,5,0};
		Polinomio polinomio = new Polinomio(3, coeficientes);
		//System.out.println("Pow Grado 3 " + polinomio.evaluarPow(3));
		Assert.assertEquals(42, polinomio.evaluarPow(3), 0);
	}

	@Test
	public void evaluarPowGrado6() {
		double[]coeficientes = {-5,3,0,-2,7,3,0};
		Polinomio polinomio = new Polinomio(6, coeficientes);
		//System.out.println("Pow Grado 6 " + polinomio.evaluarPow(3));
		Assert.assertEquals(-2898, polinomio.evaluarPow(3), 0);
	}
	

	@Test
	public void evaluarPowGrado0() {
		double[]coeficientes = {2};
		Polinomio polinomio = new Polinomio(0, coeficientes);
		//System.out.println("Pow Grado 0 " + polinomio.evaluarPow(2));
		Assert.assertEquals(2, polinomio.evaluarPow(2), 0);
	}
	
	@Test
	public void evaluarPowGrado1() {
		double[]coeficientes = {2,3};
		Polinomio polinomio = new Polinomio(1, coeficientes);
		//System.out.println("Pow Grado 1 " + polinomio.evaluarPow(2));
		Assert.assertEquals(7, polinomio.evaluarPow(2), 0);
	}	
	
	@Test
	public void evaluarHornerGrado3() {
		double[]coeficientes = {2,-3,5,0};
		Polinomio polinomio = new Polinomio(3, coeficientes);
		//System.out.println("Horner Grado 3 " + polinomio.evaluarHorner(3));
		Assert.assertEquals(42, polinomio.evaluarHorner(3), 0);
	}

	@Test
	public void evaluarHornerGrado6() {
		double[]coeficientes = {-5,3,0,-2,7,3,0};
		Polinomio polinomio = new Polinomio(6, coeficientes);
		//System.out.println("Horner Grado 6 " + polinomio.evaluarHorner(3));
		Assert.assertEquals(-2898, polinomio.evaluarHorner(3), 0);
	}

	@Test
	public void evaluarHornerGrado0() {
		double[]coeficientes = {5};
		Polinomio polinomio = new Polinomio(0, coeficientes);
		//System.out.println("Horner Grado 0 " + polinomio.evaluarHorner(3));
		Assert.assertEquals(5, polinomio.evaluarHorner(3), 0);
	}
	
	@Test
	public void evaluarHornerGrado1() {
		double[]coeficientes = {3,5};
		Polinomio polinomio = new Polinomio(1, coeficientes);
		//System.out.println("Horner Grado 1 " + polinomio.evaluarHorner(3));
		Assert.assertEquals(14, polinomio.evaluarHorner(3), 0);
	}

}
