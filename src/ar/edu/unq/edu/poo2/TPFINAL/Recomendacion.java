package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.ArrayList;
import java.util.List;

public interface Recomendacion {

	public int coincidencias(Desafio desafio);
	public int elegir(Desafio desafio);
	public List<Desafio> elegirLos(List<Desafio> desafios);
}
