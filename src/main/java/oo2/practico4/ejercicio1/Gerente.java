package oo2.practico4.ejercicio1;

import java.util.List;

public class Gerente implements Empleado {

	private List<MandoMedio> gerentes_a_cargo;
	private float salario;

	public Gerente(float salario) {
		this.salario = salario;
	}

	public float calcularSalario() {
		float suma = this.salario;
		for (MandoMedio gerente : gerentes_a_cargo)
			suma += gerente.calcularSalario();
		return suma;
	}
}
