package io;

import java.util.Arrays;

public class BinomioDeNewton {
	
	private int grado;
	private double[] coeficientes;
	
	public BinomioDeNewton(int a, int b, int n) {
		grado = n;
		coeficientes = new double[grado + 1];
		
		for (int i = 0; i < coeficientes.length; i++)
			coeficientes[i] = combinatorio(n, n-i) * Math.pow(a, n-i) * Math.pow(b, i);
		
	}
	
	public static long combinatorio(int n, int k) {
		Factorial fact = new Factorial(n);
		
		return fact.numero(n) / ( fact.numero(k) * fact.numero(n - k) );
	}
	
	public double[] getCoeficientes() {
		return this.coeficientes;
	}
	
	public double getKCoeficiente(int k) {
		return this.coeficientes[this.grado-k];
	}

	public static void main(String[] args) {
		int a = 1, b = 2, n = 3;
		BinomioDeNewton binomio = new BinomioDeNewton(a, b, n);
		
		double[] coeficientes = binomio.getCoeficientes();
		
		for( int i = 0 ; i <= n ; i++ )
			System.out.println("Coeficiente del termino " + i + " es " + binomio.getKCoeficiente(i) + " (x^" + i + ")");
		System.out.println("Vector de coeficientes: " + Arrays.toString(coeficientes));
		
	}

}
