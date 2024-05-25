package oo2.practico4.ejercicio3;

public abstract class Seguro {
	private final String nombre;

	public Seguro(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract double calcularCosto();
}
