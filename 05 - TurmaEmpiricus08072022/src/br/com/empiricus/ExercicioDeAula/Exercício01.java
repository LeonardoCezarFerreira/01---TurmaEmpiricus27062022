package br.com.empiricus.ExercicioDeAula;

import java.util.Scanner;

public class Exercício01 {
//Exercício 1 - Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
//Encontre após a maior pontuação e a apresente.
	public static void main(String[] args) throws InterruptedException {
		try(Scanner entrada = new Scanner(System.in)){;

		int [] valores = new int [5];
		int maior = 0;
		
		System.out.println("Digite 5 números: ");
		Thread.sleep(1000);
		for (int i = 0; i < valores.length; i++) {
			
			System.out.print("Digite o " + (i+1) + "º número: ");
			valores[i] = entrada.nextInt();
				
			if (i == 0) {
				maior = valores[i];
			}
			else if (valores[i] > maior){
				maior = valores [i];
			}
		}
				System.out.println("O maior número é: " + maior);
			}
}
}
		
					
					
	

	
