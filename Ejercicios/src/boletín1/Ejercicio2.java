package boletín1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número 12: ");
		int numero = sc.nextInt();
		sc.close();

		if (numero != 12) {
			System.out.println("Incorrecto");
		} else {
			System.out.println("Correcto");
		}

	}

}
