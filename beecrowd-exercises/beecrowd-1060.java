/**
Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.
*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int counter;
		counter = 0;
		
		Scanner reader = new Scanner(System.in);
		
		for (int i = 1; i < 7; i++) {
			double number = reader.nextDouble();
			if (number > 0) {
				counter++;
			}
		}
		System.out.printf("%d valores positivos\n", counter);
	}
}