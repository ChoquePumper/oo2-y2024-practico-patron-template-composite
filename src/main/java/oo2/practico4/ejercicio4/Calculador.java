package oo2.practico4.ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

	private final int mesEnPromocion;

	public Calculador(int mesEnPromocion) {
		this.mesEnPromocion = mesEnPromocion;
	}

	private boolean enPromocion() {
		return of(mesEnPromocion).equals(now().getMonth());
	}

	public abstract double factorInteresConPromocion();

	public abstract double factorInteresSinPromocion();

	public abstract void accionPostCalculo(double precioProducto);

	public final double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (enPromocion()) {
			precioTotal += precioProducto * factorInteresConPromocion();
		} else {
			precioTotal += precioProducto * factorInteresSinPromocion();
		}
		accionPostCalculo(precioProducto);
		return precioTotal;
	}
}