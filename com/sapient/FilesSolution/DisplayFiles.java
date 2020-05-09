package com.sapient.FilesSolution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DisplayFiles {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the path of the directory");
		String s=Read.br.next();
		Files.walk(Paths.get(s), 1).forEach(System.out::println);

	}

}
