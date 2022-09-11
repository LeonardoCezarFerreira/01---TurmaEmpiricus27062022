package br.com.empiricus.EstruturaDeControle;

import java.util.Scanner;

public class OperadorTernário {

	public static void main(String[] args) {
		
		try(Scanner entrada = new Scanner(System.in)){;
		System.out.print("Digite o Primeiro número: ");
		int x = entrada.nextInt();
		System.out.print("Digite o Segundo número: ");
		int y = entrada.nextInt();
		
		int maior = 0;
		
		maior = x > y ? x : y;
		
		System.out.println("O maior número é: " + maior + '\n'+ "A multiplicação do maior por 10 é " + maior * 10);
		
		}
		

	}

}
