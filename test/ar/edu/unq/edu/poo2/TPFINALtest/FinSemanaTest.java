package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.FinSemana;
import ar.edu.unq.edu.poo2.TPFINAL.RestriccionTemporal;

public class FinSemanaTest {

	RestriccionTemporal finSemana;

	@BeforeEach
	void setup() {
		finSemana = new FinSemana(); 
	}

	@Test
	void validarTest() {
		assertTrue(finSemana.validar(LocalDate.of(2022, 11, 5)));
	}
	
	@Test
	void validarTest2() {
		assertFalse(finSemana.validar(LocalDate.of(2022, 11, 3)));
	}
}
