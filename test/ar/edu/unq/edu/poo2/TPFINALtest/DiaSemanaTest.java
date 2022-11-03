package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.DiaSemana;
import ar.edu.unq.edu.poo2.TPFINAL.RestriccionTemporal;

public class DiaSemanaTest {

	RestriccionTemporal diaSemana;
	
	@BeforeEach
	void setup() {
		diaSemana = new DiaSemana(); // true indica dia de semana, false indica fin de semana
	}

	
	@Test
	void validarTest() {
		assertTrue(diaSemana.validar(LocalDate.of(2022, 11, 3)));
	}
	
	@Test
	void validarTest2() {
		assertFalse(diaSemana.validar(LocalDate.of(2022, 11, 5)));
	}
}

