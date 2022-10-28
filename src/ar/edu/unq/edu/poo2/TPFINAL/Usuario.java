package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.List;

public class Usuario implements Observable{
	
	private List<Observer> observers;
	private Muestra ultimaMuestra;

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

}
