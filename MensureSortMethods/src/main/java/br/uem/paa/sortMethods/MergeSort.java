package br.uem.paa.sortMethods;

import br.uem.paa.util.SortMethod;

public class MergeSort implements SortMethod {

    private int[] array;
    private int[] helper;

    @Override
    public void run(int[] array) {
        mergeSortable(array);
    }
    
    public void mergeSortable(int[] array) {
        this.array = array;
        int lenfth = array.length;
        this.helper = new int[lenfth];
        mergesort(0, lenfth - 1);
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergesort(low, middle);
            mergesort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = helper[i];
            k++;
            i++;
        }
    }
}
