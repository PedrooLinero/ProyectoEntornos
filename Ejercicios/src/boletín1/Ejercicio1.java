package boletín1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número: " );
		int numero=sc.nextInt();
		sc.close();
		
		if (numero > 0 ) {
			System.out.println("El numero es positivo ");
		}
		
		else {
			System.out.println("El numero no es positivo");
		}
		
	}

}

