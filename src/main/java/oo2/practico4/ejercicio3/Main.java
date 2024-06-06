package oo2.practico4.ejercicio3;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Seguro[] seguros = {
				new SeguroAutomovil("Seguro automóvil", 99),
				new SeguroDeVida("Seguro de vida", 202),
				new SeguroHogar("Hogar", 199),
				new SeguroMedico("Seguro Médico", 200),
				new Paquete("Subpaquete", Arrays.asList(new Seguro[]{
						new SeguroHogar("Seguro hogar en paquete", 120),
						new SeguroDeVida("Otro seguro de vida", 235),
				})),
		};

		Seguro seguro = new Paquete("Paquete principal", Arrays.asList(seguros));
		System.out.println(seguro);
		System.out.println(seguro.calcularCosto());
	}
}
