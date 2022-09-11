package br.com.empiricus.exercicios29062022;

import java.util.Scanner;

public class OperadorDeAtribuição {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int x, y;

		System.out.print("Digite um número: ");
		x = entrada.nextInt();
		System.out.print("Digite um número: ");
		y = entrada.nextInt();

		x += y;
		System.out.println("O resultado é: " + x);
	}

}
