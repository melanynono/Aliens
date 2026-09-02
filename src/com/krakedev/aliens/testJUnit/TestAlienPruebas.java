package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienPruebas {
	
	private static final double TOLERANCIA = 0.0001;

	@Test
	public void asignarAtributos() {
		
		Alien a1 = new Alien(20, "Blanco");
		
		assertEquals(20, a1.getTamanio());
		assertEquals("Blanco", a1.getColor());
	}
	
	 @Test
	    public void TamanioMenor() {
	        Alien a1 = new Alien(3, "Azul");

	        assertEquals(5, a1.getTamanio());
	    }

	    @Test
	    public void TamanioMayor() {
	        Alien a1 = new Alien(40, "Rojo");

	        assertEquals(30, a1.getTamanio());
	    }
	    
	    @Test
	    public void calcularPrecioCuerpo() {
	        Alien alien = new Alien(20, "Blanco");
	        assertEquals(4.0, alien.getPrecioCuerpo(), TOLERANCIA);
	    }

	    @Test
	    public void calcularPrecioExtremidad() {
	        Alien alien = new Alien(20, "Blanco");

	        assertEquals(2.0, alien.getPrecioExtremidad(), TOLERANCIA);
	    }

	    @Test
	    public void calcularPrecioOjo() {
	        Alien alien = new Alien(20, "Blanco");

	        assertEquals(1.0, alien.getPrecioOjo(), TOLERANCIA);
	    }
	    

}
