package bolet�n1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un numero: ");
		int numero=sc.nextInt();
		sc.close();
		
		if (numero %2==0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
	}

}
