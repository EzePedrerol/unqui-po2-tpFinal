package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PreferenciasJuego implements Recomendacion {

	Usuario usuario;
	
	
	public PreferenciasJuego(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public int elegir(Desafio desafio) {
		return this.coincidencias(desafio);
	}

	@Override
	public int coincidencias(Desafio desafio) {
		int muestras = Math.abs(this.usuario.getPreferencia().getCantMuestras() - desafio.getCantidadMuestras());
		int dificultad = Math.abs(this.usuario.getPreferencia().getDificultad() - desafio.getDificultad());
		int recompensa = Math.abs(this.usuario.getPreferencia().getRecompensa() - desafio.getRecompensa());
		
		return muestras + dificultad + recompensa;		
	}

	@Override
	public List<Desafio> elegirLos(List<Desafio> desafios) {
		List<Desafio> desafiosElegidos = desafios.stream().sorted(Comparator.comparingInt(desafio -> this.elegir(desafio))).collect(Collectors.toList());
		
		desafiosElegidos = desafiosElegidos.stream().limit(1).collect(Collectors.toList());
		
		return desafiosElegidos;
	}
}
