package boletín1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		final double gravedad = 9.8; //CONSTANTE --> final

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor del tiempo: ");
        double tiempo = sc.nextDouble();
        sc.close();

        if (tiempo <= 0) {
            System.out.println("Tiempo incorrecto");
        } else {
            double velocidad = gravedad * tiempo; 
            System.out.println("La velocidad es: " + velocidad + " m/s");
        }
    }
}
	
