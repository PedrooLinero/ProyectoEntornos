package bolet�n1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el n�mero 12: ");
		int numero = sc.nextInt();
		sc.close();

		if (numero != 12) {
			System.out.println("Incorrecto");
		} else {
			System.out.println("Correcto");
		}

	}

}
