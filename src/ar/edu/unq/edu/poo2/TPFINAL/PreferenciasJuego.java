package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PreferenciasJuego extends Recomendacion {

	Usuario usuario;

	public PreferenciasJuego(Usuario usuario) {
		this.usuario = usuario;
	}

	public int elegir(Desafio desafio) {
		return this.coincidencias(desafio);
	}

	public List<Desafio> elegirLos(List<Desafio> desafios) {
		List<Desafio> desafiosElegidos = desafios.stream()
				.sorted(Comparator.comparingInt(desafio -> this.elegir(desafio))).collect(Collectors.toList());

		desafiosElegidos = desafiosElegidos.stream().limit(1).collect(Collectors.toList());

		return desafiosElegidos;
	}
}
