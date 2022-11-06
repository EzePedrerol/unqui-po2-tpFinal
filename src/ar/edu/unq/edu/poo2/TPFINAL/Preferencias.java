package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.ArrayList;
import java.util.List;

public class Preferencias implements Recomendacion {

	Usuario usuario;
	
	public Preferencia(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public int elegir(Desafio desafio) {
		int muestras = abs(this.usuario.getPreferencia().getCantMuestras() - desafio.getCantidadMuestras());
		int dificultad = abs(this.usuario.getPreferencia().getDificultad() - desafio.getDificultad());
		int recompensa = abs(this.usuario.getPreferencia().getRecompensa() - desafio.getRecompensa());
		
		return muestras + dificultad + recompensa;
	}
}
