package mundo;

//Para trabajar con los objetos que se meten por consola
import java.util.*;


public class ClaseRepaso {
	
	
	public static void main(String[] args) {
		
//		//Variables
//		
//		//Java es fuertemente tipado o sea que debemos decir de qué tipo es la variable
//		int a = 2;
//		
//		//Cierta cantidad de bytes permitidos para guardar
//		float b = 56.2f; // 56.2 es automaticamente double por eso le ponemos f al final
//		// para que ese quede guardado como float
//		
//		// Guarda el doble de lo que guarda float
//		double c = 56.2d; // aquí le decimos que lo guademos como double
//		
//		byte t = 1; // Qué es long?
//		
//		long e = 365L; // entero pero más largo que int.
//		
//		char sign = 'r'; // Guarda ASCII con comilla sencilla
//		char sign2= 56; // Aquí no estoy guardando el numero 56 sino el char que en el 
//		//código ASCII tiene asignado el número 56
//		
//		//String funciona como una clase, no como un objeto. 
//		
//		String palabra = "Hola";
//		String palabra2 = new String("Hola");
//		
//		//También hay clases dedicadas a los números u objetos del principio
//		
//		Integer ab = 5;
//		// También por ejemplo si queremos usar la  clase para rellenar listas
//		//List <Integer>
//		
//		
//		// Operaciones usuales + , -, *, /, %
//		//Operaciones lógicas && (y), || ( o ), ==, != (diferente), < , >, <=, >=, 
//		
//		double temperaturaEnCelsius = 40.0;
//		
//		double temperaturaEnFarenheit = 9*(temperaturaEnCelsius)/5 +32;
//		
//		System.out.println(temperaturaEnFarenheit);
//		
//		double kilometroPorHora = 40;
//		
//		double metrosPorSec = 1000*(kilometroPorHora)/ (60*60);
//		
//		// Para trabajar con objetos que se reciben por consola
//		
//		Scanner s = new Scanner(System.in);
//		
//		//System.out.print("Hola, cual es tu nombre?"); // para que imprima sin salto de línea
//		
//		// usualmente lo que se recibe de consola se guarda en tipo String
//		
//		//String name = s.next(); // aquí le decimos que guarde lo que leyó en la consola en una variable
//		
//		//System.out.println("Bienvenido/a " + name +"!");
//		//System.out.println("Por favor introduce un número: ");
//		
//		//int numero = s.nextInt(); // guarda lo recibido por consola en una variable de tipo int
//		
//		//recibir un numero por consola de tres digitos y separarlo por cifras
//		
////		System.out.println("Introduzca un numero de tres cifras");
////		double numero = s.nextInt();
////		double cifra1 = numero/100;
////		double cifra2 = (numero - (cifra1*100))/10;
////		double cifra3 = (numero -(cifra1*100) -(cifra2*10));
////		
////		System.out.println(cifra1 + cifra2 + cifra3);
////		
////		
//
////		// Números amigos
////		
////		int coso = 184;
////		int divisor = 0;
////		int divisor2 = 0;
////		int coso1 = 1210;
////		
////		for(int i = 1; i<coso; i++) {
////			if(coso%i == 0) {
////				divisor +=i;
////			}	
////		}
////		
////		//System.out.println(divisor);
//		
//		
////		for(int i = 1; i<coso1; i++) {
////			if(coso1%i == 0) {
////				divisor2 +=i;
////			}	
////		}
////		
////		//System.out.println(divisor2);
////		
////		if(divisor == coso1 && coso ==divisor2) {
////			System.out.println("Los numeros son amigos");
////		}else
////			System.out.println("no son números amigos");
////		
//		//SUMA DESDE UN NUMERO HASTA N DE MANERA RECURSIVA
//		
//		
//		// Calcular la multiplicacion de los primeros 10 impares
//		
////		int i = 0;
////		int h = 1;
////		int p = 1;
////		while(i <10) {
////			h++;
////			if(h%2 == 0) {
////				i++;
////				p = p*h;
////			}
////		}
////		System.out.println(p);
//		
//		//calcular la conversión de un decimal a binario. 
//		
////		int  decimal = 72;
////		String binario = " ";
////		while(decimal != 1) {
////			decimal = decimal/2;
////			binario = decimal%2 + "" + binario;
////		}
////		binario = decimal + binario;
////		System.out.println(binario);
//
//
//		// dar un número y verificar cuantos primos hay 
//		
////		int numero = 20;
////		int primos = 0;
////		int i = 0;
////		while(i<=numero) {
////			for(int j = 2; j<i; j++) {
////				if(i%j == 0) { // no sirve porque nunca va a entrar 
////					primos = primos;
////				}
////		}
////		
		
		
		//Conjetura de Collatz
		// Si el numero es par se divide entre dos
		//Si el numero es impar se multiplica por 3 y se suma 1
//		
//		int numero = 6;
//		int contador = 0;
//		int prueba = 0;
//		while (numero != 1) {
//			prueba = Collatz(numero);
//			numero = prueba;
//			contador++;
//		}
//		System.out.println(contador);
//		
//		
	
		// Sumar los números de 1 a 10 de manera recursiva
		
		int prueba = 20000;
		int resultado = 0;
		System.out.println(Suma(prueba, resultado));
		
		
		
	}
	
	public static int Collatz(int numero) {
		int cosito = 0;
		if(numero%2 == 0) {
			cosito = numero/2;
		}else {
			cosito = numero*3 +1;
		}
		return cosito;
	}
	
	
	public static int Suma(int numero, int resultado) {
		if(numero > 0) {
			return numero + Suma(numero-1, resultado);
		}else {
			return numero;	
		}
	}

	
	
}
