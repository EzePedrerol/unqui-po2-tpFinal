package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Usuario implements Observable{
	
	private List<Proyecto> proyectos; // debe ir uno o el otro, no los dos
	private List<Observer> observers; //
	private Muestra ultimaMuestra;
	private List<Muestra> muestras;
	

	public Usuario() {
		observers = new ArrayList<Observer>();
		muestras = new ArrayList<Muestra>();
		proyectos = new ArrayList<Proyecto>();

	}
	
	@Override
	public void attach(Observer ob) {
		this.observers.add(ob);
	}

	@Override
	public void detach(Observer ob) {
		this.observers.remove(ob);		
	}

	@Override
	public void notificar() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	public  List<Muestra> getMuestras() {
		return this.muestras;
	}

	public void suscribirseA(Proyecto proyecto) {
		proyecto.suscribirUsuario(this);
		this.proyectos.add(proyecto);
		this.observers.add(proyecto);	// corregir, dejar uno o el otro
	}

	public List<Proyecto> getProyecto() {
		return this.proyectos;
	}
	
	public Muestra getUltimaMuestra() {
		return this.ultimaMuestra;
	}
	
	
	public void recogerMuestra(Muestra muestra) {
		this.muestras.add(muestra);
		this.ultimaMuestra = muestra;
		// avisar al proyecto
	}
	
	/*
	 * aceptarDesafio
	 * votar
	 * deafiosCompletados
	 * porcentajeCompletitud(desafio)
	 * porcentajeCompletitudGeneral
	 * BuscarMatch
	 */
	
	

}
