package es.bbva.calculos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void suma() {
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.suma(2,2) == 4);
    }

    @Test
    void resta() {
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.resta(2,2) == 0);
    }

    @Test
    void multiplicacion() {
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.multiplicacion(2,4) == 8);
    }

    @Test
    void division() {
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.division(8,2) == 4);
    }
}