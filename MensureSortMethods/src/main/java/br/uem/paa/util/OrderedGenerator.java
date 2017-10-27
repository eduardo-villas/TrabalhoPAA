package br.uem.paa.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OrderedGenerator extends ArrayGenerator {



	@Override
	void fillArray(long[] array) {
		for (int i = 0; i < array.length; ++i) {
			array[i] = i;
		}
	}

	@Override
	public StatisticGenerator getStatisticGenerator(String nameOfClass) {
		StatisticGenerator statisticGenerator = new StatisticGenerator(nameOfClass) {
			@Override
			protected String getFileName(String fileName) {
				return fileName.replace(":Type:", "Orderede");
			}
		};
		return statisticGenerator;
	}

}
