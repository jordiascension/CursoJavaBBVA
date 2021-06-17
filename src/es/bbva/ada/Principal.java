package es.bbva.ada;

import java.util.Scanner;

public class Principal {

    private static final int  CALCULAR = 1;
    private static final int  FINALIZAR = 2;

    public static void main(String[] args) {
        //los diferentes parametros de la renta y que des la deduccion.
        //la base imponible y el plan de pensiones

        Scanner entrada = new Scanner(System.in);
        int i = 0;
        int e = 0;
        int tipo = 0;
        float deduccion = 0;

        do{
            Persona persona0 = new Persona();

            System.out.println("Indique los siguientes parametros");
            System.out.println("Nombre: ");
            persona0.setNombre(entrada.next());

            System.out.println("Apellido: ");
            persona0.setApellidos(entrada.next());

            System.out.println("Base Imponible: ");
            persona0.setBase(entrada.nextFloat());

            System.out.println("Dinero para el Plan de pensiones: ");
            persona0.setPlan(entrada.nextFloat());

            PlanPensiones planPensiones = new PlanPensiones();
            deduccion = planPensiones.calcularPlan(persona0);

            System.out.println("El cliente: " + persona0.getNombre() + " " +
                    persona0.getApellidos());
            System.out.println("Podra deducirse: " + deduccion + ". Teniendo de Base: " + persona0.getBase()
                    + " y su plan de pensiones sea: " + persona0.getPlan());

            if(e<10){
                System.out.println("Indique que operacion quiere realizar: ");
                System.out.println("1. Calcular la deduccion de la renta de nuevo");
                System.out.println("2. Finalizar el programa");
                i=entrada.nextInt();
            } else {
                i = FINALIZAR;
            }
            e++;
        }while(i == CALCULAR);

    }
}
