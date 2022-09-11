package br.com.empiricus.ExercicioWhile;

import java.util.Scanner;

public class Vetor02 {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){;
		System.out.print("Tamanho do Vetor: ");
		
		int tamanhoVetor = entrada.nextInt();
		double [] notas = new double [tamanhoVetor];
		double soma = 0.0, media = 0.0;
		
		System.out.println("Digite as Notas do Aluno: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(i+1 + "º nota: ");
			notas[i] = entrada.nextDouble();
			soma += notas[i];
			media = soma/notas.length;
			}
		System.out.printf("A soma das notas é: %.2f \n", soma);
		System.out.printf("A média das notas é: %.2f", media);
	}
	}
}
