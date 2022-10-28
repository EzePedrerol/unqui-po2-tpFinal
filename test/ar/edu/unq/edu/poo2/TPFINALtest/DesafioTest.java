package ar.edu.unq.edu.poo2.TPFINALtest;

import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.edu.poo2.TPFINAL.Area;
import ar.edu.unq.edu.poo2.TPFINAL.Desafio;

public class DesafioTest {
	Desafio desafio;
	Area area;
	
	@BeforeEach
	public void setup() {
		area = new Area(30, 15, 50);
		desafio = new Desafio();
	}

}
