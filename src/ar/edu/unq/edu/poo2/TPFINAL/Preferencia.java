package ar.edu.unq.edu.poo2.TPFINAL;

public class Preferencia {

	private int recompensa;
	private int dificultad;
	private int cantMuestras;

	public Preferencia(int cantMuestras, int dificultad, int recompensa) {
		this.setCantMuestras(cantMuestras);
		this.setDificultad(dificultad);
		this.setRecompensa(recompensa);
	}

	private void setRecompensa(int recompensa) {
		this.recompensa=recompensa;
	}

	private void setDificultad(int dificultad) {
		this.dificultad=dificultad;
	}

	private void setCantMuestras(int cantMuestras) {
		this.cantMuestras=cantMuestras;
	}

	public int getCantMuestras() {
		return cantMuestras;
	}

	public int getDificultad() {
		return dificultad;
	}

	public int getRecompensa() {
		return recompensa;
	}

}
