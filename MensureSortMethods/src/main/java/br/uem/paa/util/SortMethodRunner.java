package br.uem.paa.util;

public class SortMethodRunner {

	private SortMethod sortMethod;
	private ArrayGenerator reverseArrayGenerator = new ReverseGenerator();
	private ArrayGenerator orderedArrayGenerator = new OrderedGenerator();

	public SortMethodRunner(SortMethod sortMethod) {
		this.sortMethod = sortMethod;
	}

	public String getSorMethodName() {
		return this.sortMethod.getClass().getSimpleName();
	}
	
	public void runMethod() {
		runMethodArray(sortMethod, reverseArrayGenerator);
		runMethodArray(sortMethod, orderedArrayGenerator);
	}

	private void runMethodArray(SortMethod sortMethod, ArrayGenerator arrayGenerator) {

		StatisticGenerator statisticGenerator = arrayGenerator
				.getStatisticGenerator(sortMethod.getClass().getSimpleName().toLowerCase() + ":Type:.xls");

		int array[] = null;
		long miliSeconds = 0;
		do {
			array = arrayGenerator.generate(array);
			
			long initTime = System.currentTimeMillis();
			sortMethod.run(array);
			long finalTime = System.currentTimeMillis();
			miliSeconds = finalTime - initTime;
			
			statisticGenerator.writeLine(array.length, miliSeconds);
		} while (miliSeconds < 60000);

		statisticGenerator.close();
	}
}
