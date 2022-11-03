package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Combinacion;
import ar.edu.unq.edu.poo2.TPFINAL.DiaSemana;
import ar.edu.unq.edu.poo2.TPFINAL.EntreFechas;
import ar.edu.unq.edu.poo2.TPFINAL.FinSemana;
import ar.edu.unq.edu.poo2.TPFINAL.RestriccionTemporal;

public class CombinacionTest {

	RestriccionTemporal comb;
	RestriccionTemporal finSemana;
	RestriccionTemporal diaSemana;
	RestriccionTemporal entreFechas;
	

	@BeforeEach
	void setup() {
		comb = new Combinacion(); 
		finSemana = new FinSemana();
		diaSemana = new DiaSemana();
		entreFechas = new EntreFechas(LocalDate.of(2022, 11, 3), LocalDate.of(2022,12,10));
	}

	@Test
	void validarFINDEentreFechasTest() {
		
		comb.add(finSemana);
		comb.add(entreFechas);
		
		assertTrue(comb.validar(LocalDate.of(2022, 11, 13)));
	}

	@Test
	void validarFINDEentreFechasTest2() {
		
		comb.add(finSemana);
		comb.add(entreFechas);
		
		assertFalse(comb.validar(LocalDate.of(2002, 11, 3)));
		assertFalse(comb.validar(LocalDate.of(2022, 11, 4)));
	}
	
	@Test
	void validarSEMANAentreFechasTest() {
		
		comb.add(diaSemana);
		comb.add(entreFechas);
		
		
		assertTrue(comb.validar(LocalDate.of(2022, 11, 4)));
		
	}

	@Test
	void validarSEMANAentreFechasTest2() {
		
		comb.add(diaSemana);
		comb.add(entreFechas);
		
		
		assertFalse(comb.validar(LocalDate.of(2002, 11, 13)));
		assertFalse(comb.validar(LocalDate.of(2022, 11, 13)));
	}
}