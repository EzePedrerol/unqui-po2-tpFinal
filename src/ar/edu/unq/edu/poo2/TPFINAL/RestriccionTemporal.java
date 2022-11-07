package ar.edu.unq.edu.poo2.TPFINAL;

import java.time.LocalDate;
import java.util.List;


public abstract class RestriccionTemporal {
	
	public abstract Boolean validar(LocalDate unaFecha) ;
	public abstract void add(RestriccionTemporal rT);
	public abstract void remove(RestriccionTemporal rT);
	public abstract int getChild();
	
	
}
