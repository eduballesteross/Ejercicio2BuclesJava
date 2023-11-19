package edu.Ejercicio2Bucles.Servicios;

import java.util.Scanner;


public class operativaImplementacion implements operativaInterfaz{

	
	public int CapturaEnteroComprobacion(String mensaje, Scanner scanner) {
		int numero;
		
		do {
			
			System.out.println("Introduzca un número para comprobar si es primo o no:");
			
		while (!scanner.hasNextInt()){
			System.out.println("[INFO] Los números negativos, el cero o los numeros con decimales pueden ser numeros primos.");
			System.out.println(mensaje);
			scanner.next();
		}
		
		numero=scanner.nextInt();
		
	
		
		}while(numero<=0);
		
		return numero;
		}

	
	public boolean ComprobadorNumeroPrimo(int comprobacionNumero) {
		
		
		if (comprobacionNumero<2) {
		
			System.out.println("El numero introducido no es primo.");
			
			return false;
		
		}else if (comprobacionNumero%2==0) {
			
			System.out.println("El numero introducido no es primo.");
			return false;
			
		} else if(comprobacionNumero%Math.sqrt(comprobacionNumero)==0) {
			
			System.out.println("El numero introducido no es primo.");
			return false;
			
		}else {
			System.out.println("El numero introducido es primo.");
			
		}
		return true;
		}


	
	public void MostrarXNumerosPrimos() {
		
		Scanner sc = new Scanner(System.in);
		
		int numRepeticiones;
		int primosEncontrados=0;
		
		System.out.println("Introduzca el numero de numeros primos que quieres ver.");
		
		numRepeticiones=sc.nextInt();
		
		for (int i=2 ; primosEncontrados <= numRepeticiones; i++ ) {
			
			if(ComprobadorNumeroPrimo(i)) {
				 System.out.print(i + " ");
				 primosEncontrados++;
			
		}
		
	}
		
	
		
	}
	}


