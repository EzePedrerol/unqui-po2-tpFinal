package ar.edu.unq.edu.poo2.TPFINAL;

public class Area {

	private float radio;
	private float longitud;
	private float latitud;

	public Area(float latitud, float longitud, float radio) {
		this.setLatitud(latitud);
		this.setLongitud(longitud);
		this.setRadio(radio);
	}

	private void setRadio(float radio) {
		this.radio=radio;
	}

	private void setLongitud(float longitud) {
		this.longitud=longitud;
	}

	private void setLatitud(float latitud) {
		this.latitud=latitud;
	}

	public float getLatitud() {
		return latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public float getRadio() {
		return radio;
	}
}
