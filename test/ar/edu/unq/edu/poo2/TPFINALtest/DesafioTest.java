package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Area;
import ar.edu.unq.edu.poo2.TPFINAL.Desafio;

public class DesafioTest {
	Desafio desafio;
	Area area;
	// RestriccionTemporal restriccion;
	
	@BeforeEach
	public void setup() {
		// restriccion = new RestriccionTemporal();
		area = mock(Area.class);
		desafio = new Desafio(10, 5, 5, area); // agregar restriccion temporal cuando este la clase
	}
	
	@Test
	public void getCantidadMuestrasTest() {
		assertEquals(10, desafio.getCantidadMuestras());
	}
	
	@Test
	public void getDificultadTest() {
		assertEquals(5, desafio.getDificultad());
	}
	
	@Test
	public void getRecompensaTest() {
		assertEquals(5, desafio.getRecompensa());
	}

	@Test
	public void getAreaTest() {
		assertEquals(area, desafio.getArea());
	}
}
