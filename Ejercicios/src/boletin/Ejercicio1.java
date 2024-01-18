package boletin3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un n�mero por teclado: ");
        int numero = sc.nextInt();

        while (numero != 0) {

            if (numero % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("No es par");
            }

            if (numero > 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("No es positivo");
            }

            System.out.println("El cuadrado del n�mero es: " + numero * numero);

            System.out.print("Introduce otro n�mero: ");
            numero = sc.nextInt(); // Para volver a pedir un n�mero
        }

        System.out.println("Haz introducido un 0. El programa ha terminado.");
        sc.close();
    }
}
