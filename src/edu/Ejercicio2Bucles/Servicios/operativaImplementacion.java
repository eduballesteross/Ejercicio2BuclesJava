package edu.Ejercicio2Bucles.Servicios;

import java.util.Scanner;


public class operativaImplementacion implements operativaInterfaz{

	
	public int CapturaEnteroComprobacion(Scanner scanner) {
		int numero;
		
		do {
			
			System.out.println("Introduzca el numero de numeros primos que quieres ver");
			
		while (!scanner.hasNextInt()){
			System.out.println("[INFO] Los números negativos, el cero o los numeros con decimales pueden ser numeros primos.");
			scanner.next();
		}
		
		numero=scanner.nextInt();
		
	
		
		}while(numero<=0);
		
		return numero;
		}

	
	public boolean ComprobadorNumeroPrimo(int comprobacionNumero) {
		
		
		if (comprobacionNumero<2) {
		
			
			return false;
		
		}else if (comprobacionNumero%2==0) {
			
			
			return false;
			
		} else if(comprobacionNumero%Math.sqrt(comprobacionNumero)==0) {
			
			
			return false;
			
		}else {
		
			System.out.println( );
		}
		return true;
	}
		

		
	
		
	


	
	public void MostrarXNumerosPrimos(int numRepeticiones) {
		

		Scanner sc = new Scanner(System.in);
		
		
		int primosEncontrados=0;
		
	
		
		
		
		for (int i=2 ; primosEncontrados < numRepeticiones; i++ ) {
			
			if(ComprobadorNumeroPrimo(i)) {
				 System.out.print(i);
				 primosEncontrados++;
			}
		}
				 
	}
	}


