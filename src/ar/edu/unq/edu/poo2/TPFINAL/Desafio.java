package ar.edu.unq.edu.poo2.TPFINAL;

public class Desafio {

	private int cantidadMuestras;
	private int dificultad;
	private int recompensa;
	private Area area;
	private RestriccionTemporal restriccion;
	
	public Desafio(int cantidadMuestras, int dificultad, int recompensa, Area area, RestriccionTemporal restriccion) { // agregar restriccion temporal
		this.setCantidadMuestras(cantidadMuestras);
		this.setDificultad(dificultad);
		this.setRecompensa(recompensa);
		this.setArea(area);
		this.setRestriccion(restriccion);
	}
	
	public RestriccionTemporal getRestriccion() {
		return restriccion;
	}
	
	public void setRestriccion(RestriccionTemporal restriccion) {
		this.restriccion = restriccion;
	}
	
	public int getCantidadMuestras() {
		return cantidadMuestras;
	}
	
	public void setCantidadMuestras(int muestras) {
		this.cantidadMuestras = muestras;
	}
	
	public int getDificultad() {
		return dificultad;
	}
	
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	
	public int getRecompensa() {
		return recompensa;
	}
	
	public void setRecompensa(int recompensa) {
		this.recompensa = recompensa;
	}
	
	public Area getArea() {
		return area;
	}
	
	public void setArea(Area area) {
		this.area = area;
	}

	public Boolean perteneceA(Proyecto proyecto) {
		return proyecto.tieneDesafio(this);
	}
}
