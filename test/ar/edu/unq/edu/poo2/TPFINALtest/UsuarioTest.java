package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Muestra;
import ar.edu.unq.edu.poo2.TPFINAL.Proyecto;
import ar.edu.unq.edu.poo2.TPFINAL.Usuario;

public class UsuarioTest {
	
	Usuario usuario;
	Proyecto proyecto;
	Muestra muestra;
	
	@BeforeEach
	public void setup() {
		usuario = new Usuario();
		proyecto = mock(Proyecto.class);
		muestra = mock(Muestra.class);
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
	
	
	@Test
	public void getUltimaMuestra_recogerMuestra_Test() {
		usuario.recogerMuestra(muestra);
		assertEquals(muestra, usuario.getUltimaMuestra());
	}
	
	@Test
	public void getMuestras_recogerMuestra_Test() {
		usuario.recogerMuestra(muestra);
		assertEquals(Arrays.asList(muestra), usuario.getMuestras());
	}
	

}
