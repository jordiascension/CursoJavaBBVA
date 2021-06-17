package es.bbva.decisiones;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int num1,num2;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese el primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = entrada.nextInt();

        entrada.close();

        if (num1 > num2) {
            System.out.println("El número " + num1 +
                    " es mayor que el número " + num2);
        }else {
            System.out.println("El número " + num1 +
                    " es menor que el número " + num2);
        }
    }
}
