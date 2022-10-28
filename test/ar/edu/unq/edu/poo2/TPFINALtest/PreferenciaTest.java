package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Preferencia;

public class PreferenciaTest {
	Preferencia preferencia;
	
	@BeforeEach
	void setup() {
		preferencia = new Preferencia(10, 3, 7);
	}
	
	@Test
	public void getcantMuestrasTest() {
		assertEquals(10, preferencia.getCantMuestras());
	}
	
	@Test
	public void getDificultadTest() {
		assertEquals(3, preferencia.getDificultad());
	}
	
	@Test
	public void getRecompensaTest() {
		assertEquals(7, preferencia.getRecompensa());
	}
	
	
	
}
