package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienPruebasIA {

    private static final double TOLERANCIA = 0.0001;

    @Test
    public void testAlienConTamanioMinimo() {

        // Se valida que el tamaño mínimo permitido sea aceptado.
        Alien alien = new Alien(5, "Verde");

        assertEquals(5, alien.getTamanio());
        assertEquals(1.0, alien.getPrecioCuerpo(), TOLERANCIA);
        assertEquals(0.5, alien.getPrecioExtremidad(), TOLERANCIA);
        assertEquals(0.25, alien.getPrecioOjo(), TOLERANCIA);
    }

    @Test
    public void testAlienConTamanioMaximo() {

        // Se valida que el tamaño máximo permitido sea aceptado.
        Alien alien = new Alien(30, "Azul");

        assertEquals(30, alien.getTamanio());
        assertEquals(6.0, alien.getPrecioCuerpo(), TOLERANCIA);
        assertEquals(3.0, alien.getPrecioExtremidad(), TOLERANCIA);
        assertEquals(1.5, alien.getPrecioOjo(), TOLERANCIA);
    }

    @Test
    public void testAlienConTamanioMenorAlMinimo() {

        // Se valida que un tamaño menor a 5 sea ajustado a 5.
        Alien alien = new Alien(1, "Rojo");

        assertEquals(5, alien.getTamanio());
    }

    @Test
    public void testAlienConTamanioMayorAlMaximo() {

        // Se valida que un tamaño mayor a 30 sea ajustado a 30.
        Alien alien = new Alien(50, "Amarillo");

        assertEquals(30, alien.getTamanio());
    }
}