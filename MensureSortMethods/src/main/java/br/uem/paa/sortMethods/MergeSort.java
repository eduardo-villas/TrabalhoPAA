package br.uem.paa.sortMethods;

import br.uem.paa.util.SortMethod;

public class MergeSort implements SortMethod {

    static long time = 500;
    @Override
    public long run(int[] array) {
        time = time * 2;
        mergeSortable(array);
        return time;
    }

    private int[] mergeSortable(int[] array) {
        //TODO colar aqui implementação do MergeSortFilipado.

        return array;
    }
}
