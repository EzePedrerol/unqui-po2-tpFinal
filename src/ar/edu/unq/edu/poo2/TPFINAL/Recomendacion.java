package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.List;

public abstract class Recomendacion {

	Usuario usuario;

	public int coincidencias(Desafio desafio) {
		int muestras = Math.abs(this.usuario.getPreferencia().getCantMuestras() - desafio.getCantidadMuestras());
		int dificultad = Math.abs(this.usuario.getPreferencia().getDificultad() - desafio.getDificultad());
		int recompensa = Math.abs(this.usuario.getPreferencia().getRecompensa() - desafio.getRecompensa());

		return muestras + dificultad + recompensa;
	}
	
	public abstract int elegir(Desafio desafio);
	public abstract List<Desafio> elegirLos(List<Desafio> desafios);
}


