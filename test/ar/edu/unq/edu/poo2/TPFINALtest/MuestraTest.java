package ar.edu.unq.edu.poo2.TPFINALtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.edu.poo2.TPFINAL.Coordenada;
import ar.edu.unq.edu.poo2.TPFINAL.Muestra;
import ar.edu.unq.edu.poo2.TPFINAL.Usuario;

public class MuestraTest   {
	Muestra muestra;
	Coordenada coordenada;
	LocalDateTime diaYHora;
	Usuario pepe;

	
	@BeforeEach
	public void setup() {
		coordenada = new Coordenada(5,10);
		diaYHora = LocalDateTime.now();
		pepe = mock(Usuario.class);
		muestra = new Muestra(coordenada, diaYHora);
	}
	
	@Test
	public void getCoordenadaTest() {
		assertEquals(coordenada, muestra.getCoordenada());
	}
	
	@Test
	public void getDiaYHoraTest() {
		assertEquals(diaYHora, muestra. getDiaYHora());
	}
	
	
	@Test
	public void getUsuarioTest() {
		muestra.setUsuario(pepe);
		assertEquals(pepe, muestra.getUsuario());
	}
}
