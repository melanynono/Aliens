package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestPruebasExtremidades {

    @Test
    public void agregarBrazosLimite() {
        Alien a1 = new Alien(20, "Blanco");
        boolean resultado = a1.agregarBrazos(10);

        assertTrue(resultado);
        assertEquals(10, a1.getNumeroBrazos());
    }

    @Test
    public void agregarPiesExcedeLimite() {
        Alien a1 = new Alien(20, "Blanco");
        a1.agregarBrazos(6);
        boolean resultado = a1.agregarPies(5);

        assertFalse(resultado);
        assertEquals(6, a1.getNumeroBrazos());
        assertEquals(0, a1.getNumeroPies());
    }

    @Test
    public void agregarBrazosPies() {
        Alien a1 = new Alien(20, "Blanco");
        boolean resultadoBrazos = a1.agregarBrazos(6);
        boolean resultadoPiernas = a1.agregarPies(4);

        assertTrue(resultadoBrazos);
        assertTrue(resultadoPiernas);

        assertEquals(6, a1.getNumeroBrazos());
        assertEquals(4, a1.getNumeroPies());
    }

    @Test
    public void agregarBrazosPiesExcedeLimite() {
        Alien a1 = new Alien(20, "Blanco");
        a1.agregarBrazos(6);
        boolean resultado = a1.agregarPies(5);

        assertFalse(resultado);
        assertEquals(6, a1.getNumeroBrazos());
        assertEquals(0, a1.getNumeroPies());
    }
}
