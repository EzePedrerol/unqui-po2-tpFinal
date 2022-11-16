package ar.edu.unq.edu.poo2.TPFINAL;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Muestra  {

	private Usuario usuario;
	private Coordenada coordenada;
	private LocalDateTime diaYHora;

	public Muestra(Coordenada coordenada, LocalDateTime diaYHora) {
	
		this.setCoordenada(coordenada);
		this.setDiaYHora(diaYHora);
		
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/*public List<Proyecto> proyectos() {
		List<Proyecto> lista = new ArrayList<Proyecto>();

		for (Proyecto proyecto : usuario.getProyecto()) {
			if (proyecto.tieneMuestra(this)) {
				lista.add(proyecto);
			}
		}

		return lista;
	}*/

	public Coordenada getCoordenada() {
		return coordenada;
	}

	private void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public LocalDateTime getDiaYHora() {
		return diaYHora;
	}

	private void setDiaYHora(LocalDateTime diaYHora) {
		this.diaYHora = diaYHora;
	}


	public int contarPara(Desafio desafio) {
		
			return 1; // corregir
		
	}

	

}
