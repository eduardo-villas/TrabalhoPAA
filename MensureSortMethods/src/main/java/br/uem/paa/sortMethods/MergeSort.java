package br.uem.paa.sortMethods;

import br.uem.paa.util.SortMethod;

public class MergeSort implements SortMethod {

    static long time = 500;
    @Override
    public long run(long[] array) {
        time = time * 2;
        mergeSortable(array);
        return time;
    }

    private long[] mergeSortable(long[] array) {
        //TODO colar aqui implementação do MergeSortFilipado.

        return array;
    }
}
