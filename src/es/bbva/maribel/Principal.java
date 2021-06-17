package es.bbva.maribel;

import java.util.Scanner;

public class Principal {

    private static final String S = "S";
    private static final String N = "N";

    public static void main(String[] args) {

        float importeDon,importePlan;
        float tipo;
        float resultado;
        String donPrevia;

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Ha donado en los dos ejercicios previos un importe igual o superior (S/N)?:");
        donPrevia  =  entrada.next();
        //if ((donPrevia != "S")  (donPrevia != "N"))  {
        //    System.out.println("No validos: ");
        //}
        System.out.println("Importe a donar: ");
        importeDon = entrada.nextInt();

        entrada.close();

        if (importeDon < 150) {
            resultado  = importeDon * 80 / 100 ;

        } else {
            if (donPrevia.equals("S")) {
                resultado = 120 + ((importeDon - 150) * 40 / 100);
            }
            else {
                resultado = 120 + ((importeDon - 150) * 35 / 100);
            }

        }

        System.out.println("El resultado es: " + resultado);

    }

}
