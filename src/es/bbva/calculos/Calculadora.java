package es.bbva.calculos;


//Single Responsability Principle
public class Calculadora {

    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    /* Comentario de
     *  múltiples líneas
     * */
    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    //Comentario de una línea
    public int division(int num1, int num2) {
        return num1 / num2;
    }
}
