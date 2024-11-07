package Ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int hora = 3;
		int minutos = 40;
		int segundos = 59;
		
		int horaResultado = hora;
		int minutoResultado = minutos;
		int segundoResultado = segundos + 1;
		
		if (segundoResultado == 60) {
			minutoResultado++;
			if (minutoResultado ==60) {
				horaResultado++;
				if (horaResultado == 24) {
					horaResultado = 0;
				}
			}
		}
		String mensaje = horaResultado + ":" + minutoResultado + ":" + segundoResultado;
		System.out.print("La hora un segundo mas tarde es: " + mensaje);
	}
	
}
