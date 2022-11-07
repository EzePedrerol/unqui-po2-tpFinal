package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Favoritos implements Recomendacion {

	Usuario usuario;

	public Favoritos(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int coincidencias(Desafio desafio) {
		int muestras = Math.abs(this.usuario.getPreferencia().getCantMuestras() - desafio.getCantidadMuestras());
		int dificultad = Math.abs(this.usuario.getPreferencia().getDificultad() - desafio.getDificultad());
		int recompensa = Math.abs(this.usuario.getPreferencia().getRecompensa() - desafio.getRecompensa());

		return muestras + dificultad + recompensa;
	}

	@Override
	public int elegir(Desafio desafio) {
		int muestras = Math.abs(this.usuario.getDesafioFav().getCantidadMuestras() - desafio.getCantidadMuestras());
		int dificultad = Math.abs(this.usuario.getDesafioFav().getDificultad() - desafio.getDificultad());
		int recompensa = Math.abs(this.usuario.getDesafioFav().getRecompensa() - desafio.getRecompensa());
		return (muestras+dificultad+recompensa)/3 ;
	}

	@Override
	public List<Desafio> elegirLos(List<Desafio> desafios) {
		List<Desafio> desafiosElegidos = desafios.stream()
				.sorted(Comparator.comparingInt(desafio -> this.coincidencias(desafio))).collect(Collectors.toList());

		desafiosElegidos = desafiosElegidos.stream().limit(20).collect(Collectors.toList());
		
		desafiosElegidos = desafiosElegidos.stream()
				.sorted(Comparator.comparingInt(desafio -> this.elegir(desafio))).collect(Collectors.toList());
		
		

		return desafiosElegidos;
	}
}
