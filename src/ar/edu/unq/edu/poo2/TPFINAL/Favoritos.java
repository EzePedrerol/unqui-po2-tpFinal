package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Favoritos extends Recomendacion {


	public Favoritos(Usuario usuario) {
		this.usuario = usuario;
	}

	public int elegir(Desafio desafio) {
		return this.coincidencias(desafio) / 3;
	}

	public List<Desafio> elegirLos(List<Desafio> desafios) {
		List<Desafio> desafiosElegidos = desafios.stream()
				.sorted(Comparator.comparingInt(desafio -> this.coincidencias(desafio))).limit(20)
				.collect(Collectors.toList());

		// desafiosElegidos =
		// desafiosElegidos.stream().limit(20).collect(Collectors.toList());

		desafiosElegidos = desafiosElegidos.stream().sorted(Comparator.comparingInt(desafio -> this.elegir(desafio)))
				.limit(1).collect(Collectors.toList());

		return desafiosElegidos;
	}
}
