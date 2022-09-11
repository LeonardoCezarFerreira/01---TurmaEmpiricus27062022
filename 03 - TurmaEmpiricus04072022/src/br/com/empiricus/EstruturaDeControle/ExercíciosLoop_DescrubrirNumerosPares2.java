package br.com.empiricus.EstruturaDeControle;

import java.util.Scanner;

public class ExercíciosLoop_DescrubrirNumerosPares2 {
//Exercício 01: Escrever um programa que receba 10 números inteiros e informe quantos deles são pares.
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in); 
			int x, numPares = 0;
			
			for (int i = 1; i <= 10;i++) { 
				System.out.print("Digite o número " + i + " ,inteiro e aleatório: ");
				x = entrada.nextInt();
				
				boolean par = x % 2 == 0 ? true : false;
			
				if (par)
				numPares++;
			}
			System.out.println("Quantidade de números pares: " + numPares);
			entrada.close();

}
}
