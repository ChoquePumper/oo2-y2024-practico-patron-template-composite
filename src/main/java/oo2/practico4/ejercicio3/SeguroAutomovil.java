package oo2.practico4.ejercicio3;

public class SeguroAutomovil extends Seguro {
	private double monto;

	public SeguroAutomovil(String nombre, double monto) {
		super(nombre);
		this.monto = monto;
	}

	@Override
	public double calcularCosto() {
		return monto;
	}
}
