package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observable{
	
	private List<Proyecto> proyectos; // debe ir uno o el otro, no los dos
	private List<Observer> observers; //
	private Muestra ultimaMuestra;
	private List<Muestra> muestras;
	private Preferencia preferencia;
	private Recomendacion recomendacion;
	

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


	public List<Proyecto> getProyecto() {
		return this.proyectos;
	}
	
	public Muestra getUltimaMuestra() {
		return this.ultimaMuestra;
	}
	
	public void setPreferencia(Preferencia preferencia) {
		this.preferencia = preferencia;
	}
	
	
	public void suscribirseA(Proyecto proyecto) {
		proyecto.suscribirUsuario(this);
		this.proyectos.add(proyecto);
		this.observers.add(proyecto);	// corregir, dejar uno o el otro
	}
	
	public void recogerMuestra(Muestra muestra) {
		this.muestras.add(muestra);
		this.ultimaMuestra = muestra;
		muestra.setUsuario(this);
		this.notificar();
		muestra.setEstado(new Contable());
	}

	public Preferencia getPreferencia() {
		return this.preferencia;
	}
	
	public void aceptarDesafio(Desafio desafio) {
		
	}
	
	public void buscarMatch(List<Desafio> desafios) {
		List<Desafio> desafiosElegidos = desafios.stream().sorted(Comparator.comparingInt(Desafio::this.recomendacion.elegir())).collect(Collectors.toList());
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
