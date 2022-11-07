package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.EntreFechas;
import ar.edu.unq.edu.poo2.TPFINAL.RestriccionTemporal;

public class EntreFechasTest {
	
	RestriccionTemporal entreFechas;
	
	@BeforeEach
	void setup() {
		entreFechas = new EntreFechas(LocalDate.of(2022, 11, 3), LocalDate.of(2022,11,10));
	}

	
	@Test
	void validarTest() {
		assertTrue(entreFechas.validar(LocalDate.of(2022, 11, 5)));
	}
	
	@Test
	void getChildTest() {
		assertEquals(0, entreFechas.getChild());
	}
}
