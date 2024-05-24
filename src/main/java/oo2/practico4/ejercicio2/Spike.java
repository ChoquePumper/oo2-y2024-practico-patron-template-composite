package oo2.practico4.ejercicio2;

public class Spike implements Item {

	private final float tiempo;

	public Spike(float tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public float verTiempo() {
		return tiempo;
	}
}
