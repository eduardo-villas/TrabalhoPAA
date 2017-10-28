/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uem.paa.sortMethods;

import br.uem.paa.util.SortMethod;

/**
 *
 * @author inaci
 */
public class BubbleSort implements SortMethod {

	public void bubbleSort(int[] dados) {

		for (int j = 0; j < (dados.length) - 1; j++) {
			for (int i = 0; i < (dados.length) - 1; i++) {

				if (dados[i] > dados[i + 1]) {

					int variavelAuxiliar = dados[i + 1];
					dados[i + 1] = dados[i];
					dados[i] = variavelAuxiliar;

				}
			}
		}
	}

	@Override
	public long run(int[] array) {

		long initTime = System.currentTimeMillis();
		bubbleSort(array);
		long finalTime = System.currentTimeMillis();

		return finalTime - initTime;

	}

}
