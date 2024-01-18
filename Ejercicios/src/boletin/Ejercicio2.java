package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una edad: ");
		int edad = sc.nextInt();

		int suma = 0;
		int contador = 0;
		int mayoresedad = 0;

		while (edad > 0) {

			suma = suma + edad; // suma+=edad --> va sumando una edad con la siguiente.

			contador++; // contar alumnos

			if (edad > 18) {

				mayoresedad++;

			}

			System.out.print("Introduce otra edad: ");
			edad = sc.nextInt();

		}

		System.out.println("La suma total de edades es: " + suma);
		System.out.println("La media de edades es: " + (double) suma / contador);
		System.out.println("El numero de alumnos total es: " + contador);
		System.out.println("El numero total de alumnos mayores de edad son: " + mayoresedad);

		sc.close();

	}

}
