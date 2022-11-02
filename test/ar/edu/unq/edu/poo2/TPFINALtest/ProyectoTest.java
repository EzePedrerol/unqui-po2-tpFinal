package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Categoria;
import ar.edu.unq.edu.poo2.TPFINAL.Muestra;
import ar.edu.unq.edu.poo2.TPFINAL.Proyecto;
import ar.edu.unq.edu.poo2.TPFINAL.Usuario;

public class ProyectoTest {
	Proyecto proyecto;
	List<Categoria> categorias;
	Categoria unaCategoria;
	Categoria otraCategoria;
	Usuario usuario;
	Muestra muestra;

	@BeforeEach
	public void setup() {
		categorias = Arrays.asList(unaCategoria);
		proyecto = new Proyecto("El Proyecto", "Soy un proyecto", categorias);
		muestra = mock(Muestra.class);
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

	@Test
	public void suscribirUsuarioTest() {
		proyecto.suscribirUsuario(usuario);
		assertEquals(1, proyecto.getUsuarios().size());
	}

	@Test
	public void getMuestrasTest() {
		assertTrue(proyecto.getMuestras().isEmpty());
	}

	@Test
	public void agregarMuestraTest() {
		proyecto.agregarMuestra(muestra);
		assertFalse(proyecto.getMuestras().isEmpty());
	}

	@Test
	public void agregarCategoriaTest() {
		proyecto.agregarCategoria(otraCategoria);
		assertFalse(proyecto.getMuestras().isEmpty());
	}
}
