package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class Usuario implements Observable {

	private List<Proyecto> proyectos; // debe ir uno o el otro, no los dos
	private List<Observer> observers; //
	private Muestra ultimaMuestra;
	private List<Muestra> muestras;
	private Preferencia preferencia;
	private Recomendacion recomendacion;
	private List<Desafio> desafiosAceptado;
	private HashMap<Integer, Desafio> desafiosValorados;

	public Usuario() {
		observers = new ArrayList<Observer>();
		muestras = new ArrayList<Muestra>();
		proyectos = new ArrayList<Proyecto>();
		this.setRecomendacion(new PreferenciasJuego(this));
		desafiosAceptado = new ArrayList<Desafio>();
		desafiosValorados = new HashMap<Integer, Desafio>();

	}

	private void setRecomendacion(PreferenciasJuego recomendacion) {
		this.recomendacion = recomendacion;
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

	public List<Muestra> getMuestras() {
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
		this.observers.add(proyecto); // corregir, dejar uno o el otro
	}

	public void recogerMuestra(Muestra muestra) {
		this.muestras.add(muestra);
		this.ultimaMuestra = muestra;
		muestra.setUsuario(this);
		this.notificar();
		// muestra.setEstado(new Contable());
	}

	public Preferencia getPreferencia() {
		return this.preferencia;
	}

	public void aceptarDesafio(Desafio desafio) {
		this.desafiosAceptado.add(desafio);

	}

	public void buscarMatch(List<Desafio> desafios) {
		List<Desafio> desafiosElegidos = this.recomendacion.elegirLos(desafios);

		
		this.aceptarDesafios(desafiosElegidos);
	}

	public void aceptarDesafios(List<Desafio> desafios) {
		for (Desafio desafio : desafios) {
			this.aceptarDesafio(desafio);
		}
	}

	public List<Desafio> getDesafios() {
		return desafiosAceptado;
	}

	public void votar(Desafio desafio, Integer valor) {
		this.desafiosValorados.put(valor, desafio);
	}

	public Desafio getDesafioFav() {

		List<Map.Entry<Integer, Desafio>> desafiosSeleccionados = new LinkedList<Map.Entry<Integer, Desafio>>(
				this.desafiosValorados.entrySet());

		Collections.sort(desafiosSeleccionados, (i1, i2) -> i1.getKey().compareTo(i2.getKey()));

		List<Desafio> temp = new ArrayList<Desafio>();
		for (Map.Entry<Integer, Desafio> d : desafiosSeleccionados) {
			temp.add(d.getValue());
		}

		return temp.get(temp.size() - 1);
	}

	public HashMap<Integer, Desafio> getDesafiosValorados() {
		return this.desafiosValorados;
	}

	public Float porcentajeCompletitudGeneral() {
		float res = 0;
		for (Desafio desafio : desafiosAceptado) {
			res = res + this.porcentajeCompletitud(desafio);
		}
		
		return res/this.desafiosAceptado.size();
	}

	public float porcentajeCompletitud(Desafio desafio) {
		
		float res = 0;
		for (Muestra muestra : this.muestras) {
			res += muestra.contarPara(desafio);
		}
		
		return res*100/desafio.getCantidadMuestras();
	}

	public List<Desafio> desafiosCompletados() {
		
		return desafiosAceptado.stream().filter(desafio -> this.porcentajeCompletitud(desafio) == 100).toList();
	}

	
}
