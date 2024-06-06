package oo2.practico4.ejercicio3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCalculoDeCostoDeSeguros {

	@Test
	void paquete1() {
		Seguro paquete = new Paquete("Paquete principal", Arrays.asList(new Seguro[]{
				new SeguroAutomovil("Seguro automóvil", 99),
				new SeguroDeVida("Seguro de vida", 202),
				new SeguroHogar("Hogar", 199),
				new SeguroMedico("Seguro Médico", 200),
				new Paquete("Subpaquete", Arrays.asList(new Seguro[]{
						new SeguroHogar("Seguro hogar en paquete", 120),
						new SeguroDeVida("Otro seguro de vida", 235),
				})),
		}));
	}

	@Test
	void paquete2() {
		Seguro paquete = new Paquete("Paquete principal", List.of(
				new Paquete("Subpaquete 1", List.of(
						new Paquete("Subpaquete 2", List.of(
								new Paquete("Subpaquete 3", List.of(
										new SeguroMedico("Seguro", 10000)
								))))))));
		// 10000 / 20 = 500 -> 10000 - 500 = 9500
		//  9500 / 20 = 475 ->  9500 - 475 = 9025
		//  9025 / 20 = 451.25 -> 9025 - 451.25 = 8573.75
		//  8573.75 / 20 = 428.6875 = 8573.75 - 428.6875 = 8145.0625
		assertEquals(8145.0625, paquete.calcularCosto());
	}
}
