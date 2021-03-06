package br.uem.paa.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StatisticGenerator {

	private String fileName;
	private PrintWriter printWriter;
	private int writers;

	public StatisticGenerator(String fileName) {
		this.writers = 0;
		this.fileName = fileName;
		printWriter = createPrinter();
	}

	private PrintWriter createPrinter() {
		Path path = Paths.get(fileName);
		try {
			Files.deleteIfExists(path);
			Files.createFile(path);
			PrintWriter printWriter = new PrintWriter(fileName);
			printWriter.write("Tamanho da Entrada;Tempo de Execução\n");
			printWriter.flush();
			return printWriter;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	void writeLine(long tamanho, long miliSeconds){
		printWriter.write(String.format("%d; %d \n", tamanho, miliSeconds));
		++this.writers;
		if (this.writers >= 1000) {
			this.writers = 0;
			printWriter.flush();
		}
	}
	
	void close() {
		printWriter.flush();
		printWriter.close();
	}

}
