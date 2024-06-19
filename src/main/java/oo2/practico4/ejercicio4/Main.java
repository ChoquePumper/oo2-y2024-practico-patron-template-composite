package oo2.practico4.ejercicio4;

import java.time.Month;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int mes = Month.JUNE.getValue();
		Calculador calcJubilado = new CalculadorJubilado(mes);
		System.out.println("Calculador jubilado");
		double[] precios = {100, 250};
		Arrays.stream(precios).forEach(precio -> mostrar(calcJubilado, precio));

		Calculador calcNoJubilado = new CalculadorNoJubilado(mes);
		System.out.println("Calculador no jubilado");
		Arrays.stream(precios).forEach(precio -> mostrar(calcNoJubilado, precio));
	}

	private static void mostrar(Calculador calculador, double precio) {
		System.out.printf("  %s \t %s%n", precio, calculador.calcularPrecio(precio));
	}
}
