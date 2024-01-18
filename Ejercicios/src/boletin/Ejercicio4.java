package boletin3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num=sc.nextInt();
		sc.close();
		
		System.out.println("Numeros desde 1 hasta "+ num);
		
		for (int i = 1; i<=num; i++) {
			
			System.out.print(i  + " ");
			
		}
		
	}

}
