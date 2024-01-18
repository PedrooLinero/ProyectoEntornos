package boletin3;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int numAleatorio = rand.nextInt(100) + 1;
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();

		while (num != numAleatorio && num != -1) {

			if (num > numAleatorio) {

				System.out.println("Mas pequeño");

			} else {

				System.out.println("Mas grande");

			}

			System.out.println("Prueba otra vez: ");
			num = sc.nextInt();

		}

		if (num == -1) {

			System.out.println("Te has rendido");
		}

		if (num == numAleatorio) {

			System.out.println("Correcto");
		}

		sc.close();

	}

}
