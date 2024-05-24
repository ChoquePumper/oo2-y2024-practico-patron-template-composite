package oo2.practico4.ejercicio2;

import java.util.Arrays;
import java.util.List;

public class HistoriaDeUsuario implements Item {
	private List<Item> items;

	public HistoriaDeUsuario(List<Item> items) {
		this.items = List.copyOf(items);
	}

	public HistoriaDeUsuario(Item... items) {
		this(Arrays.asList(items));
	}

	@Override
	public float verTiempo() {
		return this.items.stream().map(Item::verTiempo).reduce(Float::sum).orElse(0f);
	}
}
