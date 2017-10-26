package br.uem.paa;

public abstract class ArrayGenerator {

	public final long[] generate(long[] array) {
		if (array == null) {
			array = new long[10000];
		} else {
			array = new long[array.length + 10000];
		}

		fillArray(array);

		return array;
	}

	abstract void fillArray(long[] array);

	public abstract StatisticGenerator getStatisticGenerator(String string);

}
