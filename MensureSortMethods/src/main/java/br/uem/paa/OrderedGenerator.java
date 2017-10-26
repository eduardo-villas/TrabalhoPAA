package br.uem.paa;

public class OrderedGenerator extends ArrayGenerator {

	@Override
	void fillArray(long[] array) {
		for (int i = 0; i < array.length; ++i) {
			array[i] = i;
		}
	}

	@Override
	public StatisticGenerator getStatisticGenerator(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
