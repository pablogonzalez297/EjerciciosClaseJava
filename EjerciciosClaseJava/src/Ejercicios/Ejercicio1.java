package Ejercicios;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Ejercicio1 {

	public static void main(String[] args) {
		

		
		int hora = Teclado.leerInt("Escribe una hora:");
		int minutos = Teclado.leerInt("Escribe un minuto:");
		int segundos = Teclado.leerInt("Escribe un segundo:");
		
		int horaResultado = hora;
		int minutoResultado = minutos + 1;
		int segundoResultado = segundos + 1;
		
		if (segundoResultado == 60) {
			minutoResultado++;
			segundoResultado = 0;
			if (minutoResultado ==60) {
				horaResultado++;
				minutoResultado = 0;
				if (horaResultado == 24) {
					horaResultado = 0;
				}
			}
		}
		String mensaje = horaResultado + ":" + minutoResultado + ":" + segundoResultado;
		System.out.print("La hora un minuto y segundo despues: " + mensaje);
	}
	
}
