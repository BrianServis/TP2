package polinomio;

public class Main {

	public static void main(String[] args) {
		double[] c = {2,4,-1,-1,1,-1};
		Polinomio p1 = new Polinomio(5, c);
		double x = 15;
		
		long iniMSucesivas, finMSucesivas;
		long iniRecursiva, finRecursiva;
		long iniRecursivaPar, finRecursivaPar;
		long iniDinamica, finDinamica;
		long iniMejorada, finMejorada;
		long iniPow, finPow;
		long iniHorner, finHorner;
		
		System.out.println("RESULTADOS:");
		System.out.println(p1.evaluarMSucesivas(x));
		System.out.println(p1.evaluarProgDinamica(x));
		System.out.println(p1.evaluarMejorada(x));
		System.out.println(p1.evaluarPow(x));
		System.out.println(p1.evaluarHorner(x));
		System.out.println();
		
		iniMSucesivas = System.nanoTime();
		p1.evaluarMSucesivas(x);
		finMSucesivas = System.nanoTime();
		
		iniDinamica = System.nanoTime();
		p1.evaluarProgDinamica(x);
		finDinamica = System.nanoTime();
		
		iniMejorada = System.nanoTime();
		p1.evaluarMejorada(x);
		finMejorada = System.nanoTime();
		
		iniPow = System.nanoTime();
		p1.evaluarPow(x);
		finPow = System.nanoTime();
		
		iniHorner = System.nanoTime();
		p1.evaluarHorner(x);
		finHorner = System.nanoTime();
		
		System.out.println(finMSucesivas-iniMSucesivas);
		System.out.println(finDinamica-iniDinamica);
		System.out.println(finMejorada-iniMejorada);
		System.out.println(finPow-iniPow);
		System.out.println(finHorner-iniHorner);
	}

}
