package Ejercicios;

import daw.com.Pantalla;

public class EjercicioArais {

	public static void main(String[] args) {
		
		//Crear un verctor (array) de tipo cadena (String) que almacene 10 elemento.
		//DEspues, imprimir la palabra ejemplo y lo que contenga cada elemtento
		
		String[] vector;
		vector = new String[10];
	
	
		
		for(int i = 0; i < 10; i++) {
			vector[i] = "Patata n " + i*10;
			Pantalla.escribirString(vector[i]);
			vector[i].length();
			Pantalla.escribirSaltoLinea();

		}
		
		int[][] matriz = new int[2][3];
		System.out.println(matriz);
		
		for(int i = 0; i < 2; i++) {
			
		}
	
	}
	
	
}
