package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Categoria;
import ar.edu.unq.edu.poo2.TPFINAL.Proyecto;

public class ProyectoTest {
	Proyecto proyecto;
	List<Categoria> categorias;
	Categoria unaCategoria;
	Categoria otraCategoria;
	
	@BeforeEach
	public void setup() {
		categorias = Arrays.asList(unaCategoria, otraCategoria);
		proyecto = new Proyecto("El Proyecto", "Soy un proyecto", categorias);
	}
	
	@Test
	public void getTituloTest() {
		assertEquals("El Proyecto", proyecto.getTitulo());
	}

	@Test
	public void getDescripcionTest() {
		assertEquals("Soy un proyecto", proyecto.getDescripcion());
	}
	
	@Test
	public void getCategoriasTest() {
		assertEquals(categorias, proyecto.getCategorias());
	}

}
