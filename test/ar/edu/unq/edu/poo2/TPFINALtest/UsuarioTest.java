package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Proyecto;
import ar.edu.unq.edu.poo2.TPFINAL.Usuario;

public class UsuarioTest {
	
	Usuario usuario;
	Proyecto proyecto;
	
	@BeforeEach
	public void setup() {
		usuario = new Usuario();
		proyecto = mock(Proyecto.class);
	}
	
	@Test
	public void getMuestrasTest() {
		assertTrue(usuario.getMuestras().isEmpty());
	}
	
	
	
	@Test
	public void getProyectos() {
		assertTrue(usuario.getProyecto().isEmpty());
	}
	
	@Test
	public void suscribirseATest() {
		usuario.suscribirseA(proyecto);
		verify(proyecto).suscribirUsuario(usuario);
		assertFalse(usuario.getProyecto().isEmpty());
	}
	
	
	

}
