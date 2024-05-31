package oo2.practico4.ejercicio4;

public class CalculadorNoJubilado extends Calculador {
	private LogTransaction log;

	public CalculadorNoJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	public double factorInteresConPromocion() {
		return 0.15;
	}

	@Override
	public double factorInteresSinPromocion() {
		return 0.21;
	}

	@Override
	public void accionPostCalculo(double precioProducto) {
		log.log(CalculadorNoJubilado.class.getName());
	}
}
