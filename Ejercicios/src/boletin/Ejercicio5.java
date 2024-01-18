package boletin3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Solicita el valor minimo del rango: ");
		int minimo=sc.nextInt();
		System.out.print("Solicita el valor maximo del rango: ");
		int maximo=sc.nextInt();
		System.out.print("Introduce un numero: ");
		int num=sc.nextInt();
		
		while (num >= maximo || num <= minimo) {			

			System.out.print("Introduce otro numero: ");
			num=sc.nextInt();
		}
		
		System.out.println("Correcto, esta dentro del rango");
		sc.close();
	}

}
