package Ejercicios;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		int numTrabajadores = Teclado.leerInt("Escribe el numero de trabajadores:");
		Pantalla.escribirString("El numero de trabajodres es: ");
		Pantalla.escribirInt(numTrabajadores);
		
		for(int i = 0; i < numTrabajadores; i++) {
			
		}
	}

}
