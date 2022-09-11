package br.com.empiricus.exercicios29062022;

import java.util.Scanner;

public class EntradaSaídaDeDados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, soma;

		System.out.print("Digite o valor de A: ");
		a = entrada.nextInt();
		System.out.print("Digite o valor de B: ");
		b = entrada.nextInt();

		soma = a + b;

		System.out.print("A soma de A + B: " + soma);

		entrada.close();
	}

}
