package ar.edu.unq.edu.poo2.TPFINAL;

public class Coordenada {

	private int y;
	private int x;

	public Coordenada(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;

	}

	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

}
