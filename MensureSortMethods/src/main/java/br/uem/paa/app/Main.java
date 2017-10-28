package br.uem.paa.app;

import br.uem.paa.sortMethods.BubbleSort;
import br.uem.paa.sortMethods.HeapSort;
import br.uem.paa.sortMethods.MergeSort;
import br.uem.paa.util.SortMethodRunner;

public class Main {
    public static void main(String[] args) {
    	run(new SortMethodRunner(new BubbleSort()));
  //      run(new SortMethodRunner(new MergeSort()));
        run(new SortMethodRunner(new HeapSort()));
    }

	private static void run(SortMethodRunner sortMethodRunner) {
		System.out.println("Iniciando "+sortMethodRunner.getSorMethodName()+"....");
        sortMethodRunner.runMethod();
        System.out.println("Finalizando "+sortMethodRunner.getSorMethodName()+"....");
        
	}
}
