package br.uem.paa.util;

public abstract class ArrayGenerator {

	public final int[] generate(int[] array) {
		if (array == null) {
			array = new int[10000];
		} else {
			array = new int[array.length + 10000];
		}

		fillArray(array);

		return array;
	}

	abstract void fillArray(int[] array);

	public abstract StatisticGenerator getStatisticGenerator(String string);

}
