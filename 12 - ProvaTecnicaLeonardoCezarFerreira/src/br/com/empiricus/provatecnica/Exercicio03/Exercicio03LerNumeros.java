package br.com.empiricus.provatecnica.Exercicio03;

import java.util.Scanner;

public class Exercicio03LerNumeros {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){;
		System.out.print("Digite 5 numeros: \n");
		
		double [] numeros = new double [5];
		double soma = 0;
		
			for (int i = 0; i < numeros.length; i++) {
			System.out.print(i+1 + "º numero: ");
			numeros[i] = entrada.nextDouble();
			soma += numeros[i];
			}
		System.out.printf("A soma dos números é: %.2f \n", soma);
		
	}
	}
}