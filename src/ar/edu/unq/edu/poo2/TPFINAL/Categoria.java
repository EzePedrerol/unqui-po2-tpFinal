package ar.edu.unq.edu.poo2.TPFINAL;

public class Categoria {

	private String nombre;

	public Categoria(String nombre) {
		this.setNombre(nombre);
	}

	public void setNombre(String nombre) {
		this.nombre= nombre;
	}

	public Object getNombre() {
		return this.nombre;
	}

}
