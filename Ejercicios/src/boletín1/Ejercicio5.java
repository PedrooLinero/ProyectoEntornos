package bolet�n1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer n�mero entero largo: ");
        long numero1 = sc.nextLong();
        System.out.print("Introduce el segundo n�mero entero largo: ");
        long numero2 = sc.nextLong();
        System.out.print("Introduce el tercer n�mero entero largo: ");
        long numero3 = sc.nextLong();
        sc.close();

        long mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2; 
        }

        if (numero3 > mayor) {
            mayor = numero3; 
        }

        System.out.println("El n�mero mayor de los tres es: " + mayor);
    }
}