package br.uem.paa;

public class ReverseGenerator extends ArrayGenerator {


	@Override
	void fillArray(long[] array) {
		int length = array.length;
		for (int i = 0; i < array.length; ++i) {
			array[i] = length--;
		}
	}

	@Override
	public StatisticGenerator getStatisticGenerator(String string) {
		// TODO Auto-generated method stub
		return null;
	}


}
