package oo2.practico4.ejercicio3;

public class SeguroDeVida extends Seguro {
	private double monto;

	public SeguroDeVida(String nombre, double monto) {
		super(nombre);
		this.monto = monto;
	}

	@Override
	public double calcularCosto() {
		return monto;
	}
}
