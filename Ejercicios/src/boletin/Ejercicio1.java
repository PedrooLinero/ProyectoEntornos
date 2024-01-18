package boletin3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número por teclado: ");
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

            System.out.println("El cuadrado del número es: " + numero * numero);

            System.out.print("Introduce otro número: ");
            numero = sc.nextInt(); // Para volver a pedir un número
        }

        System.out.println("Haz introducido un 0. El programa ha terminado.");
        sc.close();
    }
}
