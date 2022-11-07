package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Categoria;
import ar.edu.unq.edu.poo2.TPFINAL.Desafio;
import ar.edu.unq.edu.poo2.TPFINAL.Muestra;
import ar.edu.unq.edu.poo2.TPFINAL.Preferencia;
import ar.edu.unq.edu.poo2.TPFINAL.Proyecto;
import ar.edu.unq.edu.poo2.TPFINAL.Usuario;

public class ProyectoTest {
	Proyecto proyecto;
	List<Categoria> categorias;
	Categoria unaCategoria;
	Categoria otraCategoria;
	Usuario usuario1;
	Muestra muestra;
	Desafio desafio;
	Preferencia preferencia;

	@BeforeEach
	public void setup() {
		unaCategoria = new Categoria("programacion");
		otraCategoria = new Categoria("literatura");
		categorias = Arrays.asList(unaCategoria);
		proyecto = new Proyecto("El Proyecto", "Soy un proyecto", categorias);
		muestra = mock(Muestra.class);
		desafio = mock(Desafio.class);
		usuario1 = new Usuario();
		preferencia = mock(Preferencia.class);
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
		proyecto.suscribirUsuario(usuario1);
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
		
		int cant = proyecto.getCategorias().size();
		
		proyecto.agregarCategoria(otraCategoria);
		assertEquals(cant +1, proyecto.getCategorias().size());
	}
	
	@Test
	public void agregarDesafioTest() {
		proyecto.agregarDesafio(desafio);
		assertTrue(proyecto.tieneDesafio(desafio));
	}
	
	
	@Test
	public void buscarMatchTest() {
		
		usuario1.setPreferencia(preferencia);

		when(desafio.getCantidadMuestras()).thenReturn(2);

		when(desafio.getDificultad()).thenReturn(2);

		when(desafio.getRecompensa()).thenReturn(2);

		when(preferencia.getCantMuestras()).thenReturn(2);
		when(preferencia.getDificultad()).thenReturn(2);
		when(preferencia.getRecompensa()).thenReturn(2);

		
		proyecto.agregarDesafio(desafio);
		proyecto.suscribirUsuario(usuario1);
		
		proyecto.buscarMatch();
		assertEquals(desafio, usuario1.getDesafios().get(0));
	}
	
	
	@Test
	public void getUsuariosTest() {
		proyecto.suscribirUsuario(usuario1);
		
		assertEquals(usuario1, proyecto.getUsuarios().get(0));
	}
	
	@Test
	public void getDesafiosTest() {
		proyecto.agregarDesafio(desafio);
		
		assertEquals(desafio, proyecto.getDesafios().get(0));
	}
	
	
}
