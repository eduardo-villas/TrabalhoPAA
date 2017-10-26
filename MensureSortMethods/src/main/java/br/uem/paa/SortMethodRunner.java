package br.uem.paa;

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
		StatisticGenerator statisticGenerator = arrayGenerator.getStatisticGenerator(sortMethod.getName());
		while (miliSeconds == 0 || (miliSeconds / 1000) > 60) {
			long array[] = null;
			array = arrayGenerator.generate(array);
			miliSeconds = sortMethod.run(array);
			statisticGenerator.generate(miliSeconds);
		}
		
	}

}
