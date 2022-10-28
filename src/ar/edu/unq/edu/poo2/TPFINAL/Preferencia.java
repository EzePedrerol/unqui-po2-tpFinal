package ar.edu.unq.edu.poo2.TPFINAL;

public class Preferencia {

	private int recompensa;
	private int dificultad;
	private int cantMuestras;

	public Preferencia(int cantMuestras, int dificultad, int recompensa) {
		this.setCantMuestras(cantMuestras);
		this.dificultad(dificultad);
		this.recompensa(recompensa);
	}

	public void recompensa(int recompensa) {
		this.recompensa=recompensa;
	}

	public void dificultad(int dificultad) {
		this.dificultad=dificultad;
	}

	public void setCantMuestras(int cantMuestras) {
		this.cantMuestras=cantMuestras;
	}

	public Integer getCantMuestras() {
		return cantMuestras;
	}

	public Integer getDificultad() {
		return dificultad;
	}

	public Integer getRecompensa() {
		return recompensa;
	}

}
