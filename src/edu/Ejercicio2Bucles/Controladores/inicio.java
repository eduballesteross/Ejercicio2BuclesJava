package edu.Ejercicio2Bucles.Controladores;

import edu.Ejercicio2Bucles.Servicios.*;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		operativaInterfaz operativaI = new operativaImplementacion();
		
		int numRepeticiones;
		
		numRepeticiones = operativaI.CapturaEnteroComprobacion(sc);
		
	
		operativaI.MostrarXNumerosPrimos(numRepeticiones);
			
		}
	

	
		
	}


