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
		result += coeficientes[grado-i] * termino;
		termino = 1;
	}
	return result;
}
 
//public double evaluarRecursiva (double x) { //NO FUNCIONA
//	
////a) Sin considerar si el exponente es par o impar: 
////		potencia (x ,n)=x∗potencia (x ,n−1) 
//
//	return coeficientes[grado]*potencia(x, grado)+
//		   coeficientes[grado-1]*potencia(x, grado-1);
//}


public double evaluarRecursiva (double x) {//NO FUNCIONA
 if (coeficientes[grado] == 0)
   return coeficientes[grado];
  else 
	  return coeficientes[grado]* Math.pow(x,grado)+ evaluarRecursiva(x);
}

//double potencia( double base, int exponente) {//NO FUNCIONA
//	if(grado == 0)
//	{
//		return 1;
//	} 
//	else
//	{
//		return base * potencia(base, exponente -1); // llamada recursiva
//	} 
//}

//public double evaluarRecursivaPar (double x) {//NO FUNCIONA
////	b) Considerando si el exponente es par o impar: 
////	Si n es par: potencia (x ,n)=potencia (x∗x ,n/2) 
////	Si n es impar potencia (x ,n)=x∗potencia (x ,n−1)
//	if(grado % 2 != 0) {
//	return result;
//}

public double evaluarProgDinamica (double x) {
	double result = 0, termino = 1;
	int i = 0;
	
	result += coeficientes[grado];
	for(i = grado-1; i >= 0 ; i--)
	{
		termino *= x; 
		result += coeficientes[i] * termino;
	}
	return result;
}

//public double evaluarMejorada (double x) {
//	return 0;
//}
//public double evaluarPow (double x) { //y a sugerencia de Lucas P 
//	return 0;
//}

public double evaluarHorner ( double x) {//NO FUNCIONA
	int i;
	double resultado = 0;
	for(i=0 ; i < grado; i++){
		  //Multiplicar al valor parcial el valor de x más el coeficiente
		  resultado = resultado * x + coeficientes[i];
		}
	return resultado;

}

}
