package io;
import java.lang.Math;


public class Polinomio { 
	private int grado ; 
	private double [ ] coeficientes ; 
	//La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n y 
	//la posicion n contiene al termino independiente .

public Polinomio(int grado, double[]coeficientes) 
{
	this.grado = grado;
	this.coeficientes = coeficientes;
} 

public double evaluarMSucesivas (double x) {

	double result = 0, termino = 1;
	int i = 0, j = 0;
	
	for(i = 0; i <= grado ; i++)
	{
		for(j = 0; j < i ; j++) 
		{
			termino *= x;
		}
		result += coeficientes[grado-i] * termino; //Sumo cada termino
		termino = 1;
	}
	return result;
}
 
//public double evaluarRecursiva (double x) {
//	
//a) Sin considerar si el exponente es par o impar: 
//		potencia (x ,n)=x∗potencia (x ,n−1) 
//}


//public double evaluarRecursivaParImpar (double x) {
//	b) Considerando si el exponente es par o impar: 
//	Si n es par: potencia (x ,n) = potencia (x∗x ,n/2) 
//	Si n es impar potencia (x ,n) = x∗potencia (x ,n−1)
//}

public double evaluarProgDinamica (double x) {
	double result = 0, termino = 1;
	int i = 0;
	
	result += coeficientes[grado]; //sumo el termino independiente
	for(i = grado-1; i >= 0 ; i--)
	{
		termino *= x; 
		result += coeficientes[i] * termino; //Sumo cada termino
	}
	return result;
}

public double evaluarMejorada(double x) {
		double res = 0;
		double potencia = x;
		
		if(this.grado == 0)
			return this.coeficientes[0];
		
		if(this.grado == 1)
			return this.coeficientes[0]*x + this.coeficientes[1];
		
		//Sumo termino lineal e independiente
		res += (x*this.coeficientes[this.coeficientes.length - 2] + this.coeficientes[this.coeficientes.length - 1]);
		
		//Empiezo a evaluar el polinomio desde el termino cuadratico hacia el mas alto.
		for(int i = this.grado-2; i >= 0; i--) {
			potencia *= x;
			
			res += potencia*this.coeficientes[i];
		}
		return res;
	}
	
public double evaluarPow(double x) {		//Adapto la primer funcion de sumas sucesivas
		double res = 0;
		int gradoAux = this.grado;				//La utilizo para iterar en cada potencia.		
		
		if(this.grado == 0)
			return this.coeficientes[0];
		
		if(this.grado == 1)
			return this.coeficientes[0]*x + this.coeficientes[1];
		
		//Itero por cada potencia termino elevado al cuadrado o mayor en los cuales realizo multiplicaciones sucesivas.
		for(int i = 0; i < this.grado-1; i++) {
			double multSucesiva = Math.pow(x, gradoAux);
			res += multSucesiva*this.coeficientes[i];
			gradoAux--;
		}
		
		//Una vez que tengo calculados todos los terminos elevados, le sumo el termino lineal multiplicado por el punto a analizar, mas el termino independiente.
		res += (x*this.coeficientes[this.coeficientes.length - 2] + this.coeficientes[this.coeficientes.length - 1]);
		
		return res;
	}

public double evaluarHorner(double x) {
		double res = this.coeficientes[0];
		
		for(int i = 1; i < this.coeficientes.length; i++) {
			res *= x;
			res += this.coeficientes[i];
		}
		
		return res;
	}
}
