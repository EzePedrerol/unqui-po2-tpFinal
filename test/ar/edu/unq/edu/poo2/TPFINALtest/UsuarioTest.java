package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Area;
import ar.edu.unq.edu.poo2.TPFINAL.Desafio;
import ar.edu.unq.edu.poo2.TPFINAL.EntreFechas;
import ar.edu.unq.edu.poo2.TPFINAL.Muestra;
import ar.edu.unq.edu.poo2.TPFINAL.Preferencia;
import ar.edu.unq.edu.poo2.TPFINAL.Proyecto;
import ar.edu.unq.edu.poo2.TPFINAL.RestriccionTemporal;
import ar.edu.unq.edu.poo2.TPFINAL.Usuario;

public class UsuarioTest {

	Usuario usuario;
	Proyecto proyecto;
	Muestra muestra;
	Preferencia preferencia;
	Desafio desafio1;
	Desafio desafio2;
	Desafio desafio3;
	RestriccionTemporal restriccion;
	Area area;
	List<Desafio> desafios;

	@BeforeEach
	public void setup() {
		usuario = new Usuario();
		proyecto = mock(Proyecto.class);
		muestra = mock(Muestra.class);
		preferencia = mock(Preferencia.class);
		restriccion = new EntreFechas(LocalDate.of(2022, 11, 3), LocalDate.of(2022, 11, 10));
		area = new Area(30, 15, 50);

		desafio1 = mock(Desafio.class);
		desafio2 = mock(Desafio.class);
		desafio3 = mock(Desafio.class);

		desafios = Arrays.asList(desafio1, desafio2);
		/*
		 * desafio1 = new Desafio(10, 5, 5, area, restriccion); desafio2 = new
		 * Desafio(10, 5, 5, area, restriccion); desafio3 = new Desafio(10, 5, 5, area,
		 * restriccion);
		 */
	}

	@Test
	public void getMuestrasTest() {
		assertTrue(usuario.getMuestras().isEmpty());
	}

	

	@Test
	public void suscribirseATest() {
		usuario.suscribirseA(proyecto);
		verify(proyecto).suscribirUsuario(usuario);
		assertFalse(usuario.getProyectos().isEmpty());
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

	@Test
	public void setYgetPreferencia() {
		usuario.setPreferencia(preferencia);
		assertEquals(preferencia, usuario.getPreferencia());
	}

	@Test
	public void buscarMatchPreferenciasJuegoTest() {
		usuario.setPreferencia(preferencia);

		when(desafio1.getCantidadMuestras()).thenReturn(2);
		when(desafio2.getCantidadMuestras()).thenReturn(10);

		when(desafio1.getDificultad()).thenReturn(2);
		when(desafio2.getDificultad()).thenReturn(10);

		when(desafio1.getRecompensa()).thenReturn(2);
		when(desafio2.getRecompensa()).thenReturn(10);

		when(preferencia.getCantMuestras()).thenReturn(3);
		when(preferencia.getDificultad()).thenReturn(3);
		when(preferencia.getRecompensa()).thenReturn(3);

		usuario.buscarMatch(desafios);

		assertEquals(desafio1, usuario.getDesafios().get(0));
	}

	@Test
	public void votarTest() {
		assertTrue(usuario.getDesafiosValorados().isEmpty());
		usuario.votar(desafio1, 4);
		assertFalse(usuario.getDesafiosValorados().isEmpty());
	}

	@Test
	public void getDesafioFavTest() {

		usuario.votar(desafio1, 4);
		usuario.votar(desafio2, 1);
		assertEquals(desafio1, usuario.getDesafioFav());
	}

	@Test
	public void buscarMatchFvoritosTest() {
		usuario.setPreferencia(preferencia);

		when(desafio1.getCantidadMuestras()).thenReturn(4);
		when(desafio2.getCantidadMuestras()).thenReturn(2);
		when(desafio3.getCantidadMuestras()).thenReturn(5);

		when(desafio1.getDificultad()).thenReturn(4);
		when(desafio2.getDificultad()).thenReturn(2);
		when(desafio3.getDificultad()).thenReturn(5);

		when(desafio1.getRecompensa()).thenReturn(4);
		when(desafio2.getRecompensa()).thenReturn(2);
		when(desafio3.getRecompensa()).thenReturn(5);

		when(preferencia.getCantMuestras()).thenReturn(3);
		when(preferencia.getDificultad()).thenReturn(3);
		when(preferencia.getRecompensa()).thenReturn(3);

		usuario.votar(desafio3, 5);

		usuario.buscarMatch(desafios);

		assertEquals(desafio1, usuario.getDesafios().get(0));
	}
	
	@Test
	public void porcentajeComlpletitudGeneralTest() {
		
		when(muestra.contarPara(desafio1)).thenReturn(1);
		when(desafio1.getCantidadMuestras()).thenReturn(1);
		
		usuario.aceptarDesafio(desafio1);
		usuario.recogerMuestra(muestra);
		
		
		assertEquals(100, usuario.porcentajeCompletitudGeneral());
	}
	
	@Test
	public void porcentajeComlpletitudTest() {
		
		when(muestra.contarPara(desafio1)).thenReturn(1);
		when(desafio1.getCantidadMuestras()).thenReturn(1);
		
		usuario.aceptarDesafio(desafio1);
		usuario.recogerMuestra(muestra);
		
		
		assertEquals(100, usuario.porcentajeCompletitud(desafio1));
	}
	
	@Test
	public void desafiosCompletadosTest() {
		
		when(muestra.contarPara(desafio1)).thenReturn(1);
		when(desafio1.getCantidadMuestras()).thenReturn(1);
		when(muestra.contarPara(desafio2)).thenReturn(1);
		when(desafio2.getCantidadMuestras()).thenReturn(2);
		
		usuario.aceptarDesafio(desafio1);
		usuario.recogerMuestra(muestra);
		usuario.aceptarDesafio(desafio2);
		
		
		assertEquals(Arrays.asList(desafio1), usuario.desafiosCompletados());
	}
	
}
