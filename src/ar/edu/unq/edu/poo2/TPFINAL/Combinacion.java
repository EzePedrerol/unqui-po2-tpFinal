package ar.edu.unq.edu.poo2.TPFINAL;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Combinacion extends RestriccionTemporal {
	private List<RestriccionTemporal> childs;
	
	public Combinacion() {
		childs = new ArrayList<RestriccionTemporal>(2);
	}
	

	@Override
	public Boolean validar(LocalDate unaFecha) {
		boolean ok = true;
		 int i = 0;
		 while(ok & i<childs.size()){
		 	ok = childs.get(i).validar(unaFecha);
		 	i++;
		 }
		 return ok;
	}

	@Override
	public void add(RestriccionTemporal rT) {
		childs.add(rT);
	}

	@Override
	public void remove(RestriccionTemporal rT) {
		childs.remove(rT);
	}

	@Override
	public int getChild() {
		return this.childs.size();
	}

}
