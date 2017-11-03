package br.uem.paa.util;

public abstract class ArrayGenerator {

	public final int[] generate(int[] array) {
		if (array == null) {
			array = new int[20000];
		} else {
			array = new int[array.length + 20000];
		}

		fillArray(array);

		return array;
	}

	abstract void fillArray(int[] array);

	public abstract StatisticGenerator getStatisticGenerator(String string);

}
