package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Area;
import ar.edu.unq.edu.poo2.TPFINAL.Desafio;
import ar.edu.unq.edu.poo2.TPFINAL.Proyecto;
import ar.edu.unq.edu.poo2.TPFINAL.RestriccionTemporal;

public class DesafioTest {
	Desafio desafio;
	Area area;
	RestriccionTemporal restriccion;
	Proyecto proyecto;
	
	// RestriccionTemporal restriccion;
	
	@BeforeEach
	public void setup() {
		// restriccion = new RestriccionTemporal();
		area = mock(Area.class);
		restriccion = mock(RestriccionTemporal.class);
		desafio = new Desafio(10, 5, 5, area, restriccion); 
		proyecto = mock(Proyecto.class);
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
	
	@Test
	public void getRestriccionTest() {
		assertEquals(restriccion, desafio.getRestriccion());
	}
	
	@Test
	public void perteneceAProyectoTest() {
		when(proyecto.tieneDesafio(desafio)).thenReturn(true);
		
		assertTrue(desafio.perteneceA(proyecto));
	}
}
