package br.uem.paa.util;

public class ReverseGenerator extends ArrayGenerator {


	@Override
	void fillArray(long[] array) {
		int length = array.length;
		for (int i = 0; i < array.length; ++i) {
			array[i] = length--;
		}
	}

	@Override
	public StatisticGenerator getStatisticGenerator(String nameOfClass) {
		StatisticGenerator statisticGenerator = new StatisticGenerator(nameOfClass) {
			@Override
			protected String getFileName(String fileName) {
				return fileName.replace(":Type:", "reverse");
			}
		};
		return statisticGenerator;
	}


}
