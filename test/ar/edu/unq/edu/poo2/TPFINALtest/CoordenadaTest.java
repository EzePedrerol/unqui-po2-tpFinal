package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Coordenada;

public class CoordenadaTest {
	Coordenada coordenada;
	
	@BeforeEach
	public void setup() {
		coordenada = new Coordenada(5,10);
		
	}
	
	@Test
	public void getXTest() {
		assertEquals(5, coordenada.getX());
	}
	
	@Test
	public void getYTest() {
		assertEquals(10, coordenada.getY());
	}
}
