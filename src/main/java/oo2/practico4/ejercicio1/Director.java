package oo2.practico4.ejercicio1;

import java.util.List;

public class Director implements Empleado {

	private List<Gerente> gerentes_a_cargo;
	private float salario;

	public Director(float salario) {
		this.salario = salario;
	}

	public float calcularSalario() {
		float suma = this.salario;
		for (Gerente gerente : gerentes_a_cargo)
			suma += gerente.calcularSalario();
		return suma;
	}
}
