package br.com.empiricus.ExercicioWhile;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){;
		int i = 0;
		do {
			System.out.print("Entre com o número 1: ");
			int numero1 = entrada.nextInt();
			
			System.out.print("Entre com o número 2: ");
			int numero2 = entrada.nextInt();
			
			if(numero2 == 0) {
				System.out.println("Não podemos dividir por zero");
				continue;
			}
			
			System.out.println((i+1) + "º resultado: " + numero1 + '/' + numero2 +  "é: "  + (numero1/numero2));
			i++;
		} while(i < 2);
		System.out.println("Fim do Programa");
		}
	}
}
