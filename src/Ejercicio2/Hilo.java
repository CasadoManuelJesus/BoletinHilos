package Ejercicio2;
/*
 * 2.- Diseñar un programa en modo consola que pida dos números naturales por
 * teclado. 
 * Debe crear una tarea que muestre en pantalla el valor del primer
 * número siempre y cuando sea menor que el del segundo.
 * A posteriori incrementa ese primer número.
 * Finaliza cuando el valor incrementado es igual al segundo número. 
 * 
 * Crea otra tarea que realice lo mismo pero que sea un Daemon
 * de tal forma que no termine nunca de ejecutarse. (el primer número será mayor
 * que el segundo). Mostrar en pantalla si la tarea es una aplicación o un Daemon.
 * Y cuando finalice la tarea debe aparecer también un mensaje indicando que
 * tarea ha terminado*/

import java.util.Scanner;

public class Hilo extends Thread {
	private int num1;
	private int num2;

	public Hilo(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName());
		if(currentThread().isDaemon()) {
			ejecucionDaemon();
		} else {
			ejecucionNormal();
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void ejecucionNormal() {
		if (num1 > num2) {
			System.out.println("El primer numero no es menor al segundo, con lo que no habrá ejecución.");
		} else {
			System.out.println("Comienza la ejecución:");

			while (num1 < num2) {
				System.out.println(num1);
				num1++;
			}
			System.out.println("Termina la ejecución, saliendo del hilo");

		}
	}
	
	private void ejecucionDaemon() {
		if (num1 <= num2) {
			System.out.println("El primer numero no es menor al segundo, con lo que no habrá ejecución.");
		} else {
			System.out.println("Comienza la ejecución:");

			while (num1 > num2) {
				System.out.println(num1);
				num1++;
			}
			System.out.println("Termina la ejecución, saliendo del hilo");

		}
	}
}
