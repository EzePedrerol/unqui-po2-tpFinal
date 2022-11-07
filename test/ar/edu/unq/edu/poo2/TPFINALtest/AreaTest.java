package ar.edu.unq.edu.poo2.TPFINALtest;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Area;
import ar.edu.unq.edu.poo2.TPFINAL.Coordenada;

public class AreaTest   {
	
	Area area;
	Coordenada coor;
	
	@BeforeEach
	void setup() {
		area = new Area(30, 15, 50);
		coor = mock(Coordenada.class);
	}
	
	@Test
	public void getLatitudTest() {
		assertEquals(30, area.getLatitud());
	}
	
	@Test
	public void getLongitudTest() {
		assertEquals(15, area.getLongitud());
	}

	@Test
	public void getRadioTest() {
		assertEquals(50.0, area.getRadio());
	}
	
	@Test
	public void validarTest() {
		when(coor.getX()).thenReturn(15);
		when(coor.getY()).thenReturn(30);
		assertTrue(area.validar(coor));
	}
}
