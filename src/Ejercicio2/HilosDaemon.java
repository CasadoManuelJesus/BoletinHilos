package Ejercicio2;

import java.util.Scanner;

public class HilosDaemon {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.print("Ingresa el 1º número:");
		int num1 = tec.nextInt();
		System.out.print("Ingresa el 2º número:");
		int num2 = tec.nextInt();
		tec.close();
		Hilo hilo = new Hilo(num1, num2);
		hilo.setName("Hilo normal");
		hilo.start();
		
		Hilo hiloDaemon = new Hilo(num1, num2);
		hiloDaemon.setDaemon(true);
		hiloDaemon.setName("Hilo daemon");
		hiloDaemon.start();
	}
}
