package oo2.practico4.ejercicio4;

public class CalculadorJubilado extends Calculador {
	private LogTransaction log;

	public CalculadorJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	public double factorInteresConPromocion() {
		return 0;
	}

	@Override
	public double factorInteresSinPromocion() {
		return 0.1;
	}

	@Override
	public void accionPostCalculo(double precioProducto) {
		log.log(CalculadorJubilado.class.getName());
	}
}