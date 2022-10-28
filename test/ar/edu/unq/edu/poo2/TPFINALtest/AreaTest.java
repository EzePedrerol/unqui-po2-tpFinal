package ar.edu.unq.edu.poo2.TPFINALtest;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Area;

public class AreaTest   {
	
	Area area;
	
	@BeforeEach
	void setup() {
		area = new Area(30, 15, 50);
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
}
