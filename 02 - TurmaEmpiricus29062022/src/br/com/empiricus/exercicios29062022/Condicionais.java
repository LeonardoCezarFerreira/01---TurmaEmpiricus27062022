package br.com.empiricus.exercicios29062022;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int x;
			int y;

			System.out.println("Digite o valor de X: ");
			x = entrada.nextInt();

			System.out.println("Digite o valor de Y: ");
			y = entrada.nextInt();

			if (x < y) {
				System.out.println("X é menor que Y");
			} else {
				System.out.println("X é maior que Y");
			}
		}

	}

}
