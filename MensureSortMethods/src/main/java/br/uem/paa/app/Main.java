package br.uem.paa.app;

import br.uem.paa.sortMethods.MergeSort;
import br.uem.paa.util.SortMethod;
import br.uem.paa.util.SortMethodRunner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando....");
        SortMethod merge = new MergeSort();
        SortMethodRunner sortMethodRunner = new SortMethodRunner(merge);
        sortMethodRunner.runMethod();
        System.out.println("Finalizando....");
    }
}
