package ar.edu.unq.edu.poo2.TPFINAL;

public interface Observable {
	public void attach(Observer ob);
	public void detach(Observer ob);
	public void notificar();
}
