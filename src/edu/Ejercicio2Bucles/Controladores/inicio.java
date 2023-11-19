package edu.Ejercicio2Bucles.Controladores;

import edu.Ejercicio2Bucles.Servicios.*;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		operativaInterfaz operativaI = new operativaImplementacion();
		
		int comprobacionNumero;
		
		comprobacionNumero = operativaI.CapturaEnteroComprobacion("Introduzca un número para comprobar si el numero introducido es primo o no", sc);
		
	
		operativaI.MostrarXNumerosPrimos();
			
		}
	

	
		
	}


