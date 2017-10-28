package br.uem.paa.util;

public class OrderedGenerator extends ArrayGenerator {

	@Override
	void fillArray(int[] array) {
		for (int i = 0; i < array.length; ++i) {
			array[i] = i;
		}
	}

	@Override
	public StatisticGenerator getStatisticGenerator(String nameOfClass) {
		return new StatisticGenerator(nameOfClass.replace(":Type:", "orderede"));
	}

}
