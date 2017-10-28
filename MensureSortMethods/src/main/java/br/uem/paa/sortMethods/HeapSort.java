package br.uem.paa.sortMethods;

import br.uem.paa.util.SortMethod;

public class HeapSort implements SortMethod {

	private void buildMaxHeap(int[] v) {
		for (int i = v.length / 2 - 1; i >= 0; i--)
			maxHeapify(v, i, v.length);

	}

	private void maxHeapify(int[] vetor, int pos, int tamanhoDoVetor) {

		int max = 2 * pos + 1, right = max + 1;
		if (max < tamanhoDoVetor) {

			if (right < tamanhoDoVetor && vetor[max] < vetor[right])
				max = right;

			if (vetor[max] > vetor[pos]) {
				swap(vetor, max, pos);
				maxHeapify(vetor, max, tamanhoDoVetor);
			}
		}
	}

	public void swap(int[] v, int j, int aposJ) {
		int aux = v[j];
		v[j] = v[aposJ];
		v[aposJ] = aux;
	}

	@Override
	public long run(int[] array) {

		long initTime = System.currentTimeMillis();
		heap(array);
		long finalTime = System.currentTimeMillis();

		return finalTime - initTime;
	}

	private void heap(int[] array) {

		buildMaxHeap(array);
		int n = array.length;

		for (int i = array.length - 1; i > 0; i--) {
			swap(array, i, 0);
			maxHeapify(array, 0, --n);
		}

	}
}