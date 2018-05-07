package polinomio;

public class Polinomio {
	private int grado;
	private double[] coeficientes;
		
	public Polinomio(int g, double[] c) {
		this.grado = g;
		this.coeficientes = c;
	}
	
	public double evaluarMSucesivas(double x) {
		double res = 0;
		int gradoAux = this.grado;				//La utilizo para iterar en cada potencia.		
		
		if(this.grado == 0)
			return this.coeficientes[0];
		
		if(this.grado == 1)
			return this.coeficientes[0]*x + this.coeficientes[1];
		
		//Itero por cada potencia termino elevado al cuadrado o mayor en los cuales realizo multiplicaciones sucesivas.
		for(int i = 0; i < this.grado-1; i++) {
			double multSucesiva = x;
			//Itero por la cantidad de veces que tengo que multiplicar en el termino actual. Arranca en 1 porque el primer calculo que hace es multiplicar x por si mismo, es decir, arranca al cuadrado.
			for(int j = 1; j < gradoAux; j++) 
				multSucesiva *= x;
			res += multSucesiva*this.coeficientes[i];
			gradoAux--;
		}
		
		//Una vez que tengo calculados todos los terminos elevados, le sumo el termino lineal multiplicado por el punto a analizar, mas el termino independiente.
		res += (x*this.coeficientes[this.coeficientes.length - 2] + this.coeficientes[this.coeficientes.length - 1]);
		
		return res;
	}
	
	/*public double evaluarRecursiva(double x) {			//Sin considerar si es par o impar.
		potencia(x)
	}*/
	
	public double evaluarProgDinamica(double x) {
		double res = 0;
		double potencia = 0;
		
		if(this.grado == 0)
			return this.coeficientes[0];
		
		if(this.grado == 1)
			return this.coeficientes[0]*x + this.coeficientes[1];
		
		//Evaluo desde el final del polinomio. El primer termino lo sumo directamente, el resto lo multiplico guardando el valor del termino elevado.
		for(int i = this.grado; i >= 0; i--) {
			if(potencia == 0) {
				res += this.coeficientes[this.coeficientes.length - 1];
				potencia++;
			}
			else {
				potencia *= x;
				res += potencia*this.coeficientes[i];
			}
		}
		return res;
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
