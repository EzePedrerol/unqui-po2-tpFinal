package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Categoria;

public class CategoriaTest  {
	Categoria categoria;
	
	@BeforeEach
	public void setup() {
		categoria = new Categoria("astronomía");
	}
	
	@Test
	public void getNombreTest() {
		assertEquals("astronomía", categoria.getNombre());
	}

}
