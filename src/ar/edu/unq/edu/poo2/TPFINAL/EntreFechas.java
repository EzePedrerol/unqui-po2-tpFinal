package ar.edu.unq.edu.poo2.TPFINAL;

import java.time.LocalDate;
import java.util.List;

public class EntreFechas extends RestriccionTemporal {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;

	public EntreFechas(LocalDate of, LocalDate of2) {
		this.setFechaInicio(of);
		this.setFechaFin(of2);
	}

	private void setFechaFin(LocalDate of) {
		this.fechaFin = of;
	}

	private void setFechaInicio(LocalDate of) {
		this.fechaInicio = of;
	}

	@Override
	public Boolean validar(LocalDate unaFecha) {
		return unaFecha.isAfter(fechaInicio) && unaFecha.isBefore(fechaFin);
	}

	@Override
	public void add(RestriccionTemporal rT) {
	}

	@Override
	public void remove(RestriccionTemporal rT) {
	}

	@Override
	public List<RestriccionTemporal> getChild() {
		return null;
	}

}
