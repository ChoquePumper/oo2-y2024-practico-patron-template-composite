package oo2.practico4.ejercicio3;

import java.util.List;

public class Paquete extends Seguro {
	private static final float PC_DESCUENTO = 5;
	private List<Seguro> seguros;

	public Paquete(String nombre) {
		super(nombre);
	}

	@Override
	public double calcularCosto() {
		double suma = this.seguros.stream().map(Seguro::calcularCosto).reduce(Double::sum).orElse(0d);
		double descuento = suma * PC_DESCUENTO / 100;
		return suma - descuento;
	}
}
