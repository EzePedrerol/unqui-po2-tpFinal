package ar.edu.unq.edu.poo2.TPFINAL;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;

public class FinSemana extends RestriccionTemporal {

	@Override
	public Boolean validar(LocalDate unaFecha) {
		if (unaFecha.get(ChronoField.DAY_OF_WEEK) == 6 || 
				unaFecha.get(ChronoField.DAY_OF_WEEK) == 7) {
		return true;
				}
		else {
			return false;
		}
	}

	@Override
	public void add(RestriccionTemporal rT) {

	}

	@Override
	public void remove(RestriccionTemporal rT) {

	}

	@Override
	public int getChild() {
		return 0;
	}

}
