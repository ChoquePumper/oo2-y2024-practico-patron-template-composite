package oo2.practico4.ejercicio3;

public class SeguroHogar extends Seguro {
	private double monto;

	public SeguroHogar(String nombre, double monto) {
		super(nombre);
		this.monto = monto;
	}

	@Override
	public double calcularCosto() {
		return monto;
	}
}
