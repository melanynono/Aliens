package com.krakedev.aliens.test;

import com.krakedev.aliens.Alien;

public class TestConstructores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alien a1 = new Alien(20, "Blanco");
		a1.agregarBrazos(5);
		a1.agregarPies(2);
		a1.imprimir();
		
		Alien a2 = new Alien(45, "Gris");
		a2.agregarBrazos(3);
		a2.agregarPies(4);
		a2.imprimir();
	}

}
