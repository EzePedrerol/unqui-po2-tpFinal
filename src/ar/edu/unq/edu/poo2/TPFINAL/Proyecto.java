package ar.edu.unq.edu.poo2.TPFINAL;

import java.util.ArrayList;
import java.util.List;

public class Proyecto implements Observer {
	
	private String titulo;
	private String descripcion;
	private List<Categoria> categorias;
	private List<Muestra> muestras;
	private List<Usuario> usuarios;
	
	public Proyecto(String titulo, String descripcion, List<Categoria> categorias) {
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);
		this.setCategorias(categorias);
		muestras = new ArrayList<Muestra>();
		usuarios = new ArrayList<Usuario>();
		
	}

	public List<Muestra> getMuestras() {
		return muestras;
	}

	public void setMuestras(List<Muestra> muestras) {
		this.muestras = muestras;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	@Override
	public void update(Observable observable) {
		Usuario u = (Usuario) observable;
		this.muestras.add(u.getUltimaMuestra());
		
	}

	public void suscribirUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public void agregarMuestra(Muestra muestra) {
		this.muestras.add(muestra);
	}

	public void agregarCategoria(Categoria otraCategoria) {
		this.categorias.add(otraCategoria);
	}



	

	

}
