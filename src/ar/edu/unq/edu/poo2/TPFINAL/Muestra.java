package ar.edu.unq.edu.poo2.TPFINAL;

import java.time.LocalDateTime;

public class Muestra implements State{
	
	private Usuario usuario;
	private Coordenada coordenada;
	private LocalDateTime diaYHora;
	private State estado;

	public Muestra( Coordenada coordenada, LocalDateTime diaYHora) {
		this.setUsuario(usuario);
		this.setCoordenada(coordenada);
		this.setDiaYHora(diaYHora);
		this.setEstado(new NoContable());
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

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

	public State getEstado() {
		return estado;
	}
	
	private void setEstado(State estado) {
		this.estado = estado;
	}

	@Override
	public void contar() {
		// TODO Auto-generated method stub
		
	}

	

}
