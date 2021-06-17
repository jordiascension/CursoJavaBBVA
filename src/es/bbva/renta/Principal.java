package es.bbva.renta;

import java.util.Scanner;

public class Principal {

    private static final float TIPO1 = 19.00f;
    private static final float TIPO2 = 24.00f;
    private static final float TIPO3 = 30.00f;
    private static final float TIPO4 = 37.00f;
    private static final float TIPO5 = 45.00f;
    private static final float TIPO6 = 47.00f;
    private static final float MAXIMO_PLAN = 2000f;


    public static void main(String[] args) {

        float importeBase,importePlan;
        float tipo;
        float resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese base imponible: ");
        importeBase = entrada.nextInt();
        System.out.println("Ingrese dinero aportado al plan de pensiones: ");
        importePlan = entrada.nextInt();

        System.out.println("Todo es correcto: ");
        String prueba = entrada.next();

        entrada.close();

        if (importeBase > 300000.00) {
            tipo = TIPO6;
        } else if (importeBase > 60000.00) {
            tipo = TIPO5;
        } else if (importeBase > 35200.00) {
            tipo = TIPO4;
        } else if (importeBase > 20200.00) {
            tipo = TIPO3;
        } else if (importeBase > 12450.00) {
            tipo = TIPO2;
        } else {
            tipo = TIPO1;
        }
        if (importePlan > MAXIMO_PLAN ) {
            System.out.println("La aportación maxima anual es: " + MAXIMO_PLAN);
            importePlan  = MAXIMO_PLAN ;
        }


        System.out.println("El tipo aplicado es: " +  tipo);

        resultado = importePlan * tipo / 100;

        System.out.println("El resultado es: " + resultado);

    }
}

