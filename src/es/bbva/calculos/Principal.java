package es.bbva.calculos;

public class Principal {

    public static void main(String[] args) {

        /*Creación de objetos
        * Nombre_Clase nombre_objeto = new Calculadora();
        * */
        Calculadora calculadora = new Calculadora();

        //Garbage collector
        int resultadoSuma = calculadora.suma(4, 4);
        //KISS PRINCIPLE--KEEP IT SIMPLE STUPID
        System.out.println("El resultado de la suma es " + resultadoSuma);

        int resultadoResta = calculadora.resta(4, 4);
        //KISS PRINCIPLE--KEEP IT SIMPLE STUPID
        System.out.println("El resultado de la resta es " + resultadoResta);
    }
}
