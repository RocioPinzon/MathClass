
public class ClaseMath {

	public static void main(String[] args) {
		
		//Sacar la raiz cuadrada
		
		double raiz= Math.sqrt(9.7);
		
		//Sacar el exponente
		
		double base = 4, exponente = 3;
		double resultadoEpon = Math.pow(base, exponente);
		
		//Redondeo
		double numero = 4.56;
		double resultadoRed = Math.round(numero);

		 //para redondear sin coma (sin decimales con ceros).
		double numeroSinComa = 4.56f;
		long resultadoSinComa = Math.round(numero);
		
		//Si tenemos un float
		float numeroFloat = 4.56f;
		int resultadoFloat = Math.round(numeroFloat);
		
		
		//Método Random
		
		double numRandom = Math.random();
		
		//Mostramos en pantalla 
		
		System.out.println("La raiz cuadrada es: " + raiz);
		System.out.println("El resultado de la base " + base + " y el exponente es: " + resultadoEpon);
		System.out.println("El número " + numero + " redondeado con coma decimal es: " + resultadoRed);
		System.out.println("El número " + numero + " redondeado es: " + resultadoSinComa);
		System.out.println("Si tenemos un float " + numeroFloat + " , el redondeo es: " + resultadoFloat);
		System.out.println("El número aleatorio es: " +numRandom);
		
	}

}
