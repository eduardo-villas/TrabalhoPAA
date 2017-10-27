package br.uem.paa.util;

public class SortMethodRunner {

	private SortMethod sortMethod;
	private ArrayGenerator reverseArrayGenerator = new ReverseGenerator();
	private ArrayGenerator orderedArrayGenerator = new OrderedGenerator();
	
	public SortMethodRunner(SortMethod sortMethod) {
		this.sortMethod = sortMethod;
	}

	void runMethod() {
		runMethodArray(sortMethod, reverseArrayGenerator);
		runMethodArray(sortMethod, orderedArrayGenerator);
	}

	private void runMethodArray(SortMethod sortMethod, ArrayGenerator arrayGenerator) {
		
		long miliSeconds = 0;
		StatisticGenerator statisticGenerator = arrayGenerator.getStatisticGenerator(sortMethod.getClass()
				.getSimpleName().toLowerCase() + ":Type:.xls");

		do {
			long array[] = null;
			array = arrayGenerator.generate(array);
			miliSeconds = sortMethod.run(array);
			statisticGenerator.writeLine(array.length, miliSeconds);
		} while (miliSeconds > 60000);
	}
}