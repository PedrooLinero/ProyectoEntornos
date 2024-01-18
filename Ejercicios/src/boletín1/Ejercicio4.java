package boletín1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		int num1 = sc.nextInt();
		System.out.println("Dame otro numero: ");
		int num2 = sc.nextInt();
		sc.close();

		int contador = 0;

		if (num1 % 2 == 0) {
			contador++;
		}
		if (num2 % 2 == 0) {
			contador++;
		}

		System.out.println("Hay " + contador);

	}

}
