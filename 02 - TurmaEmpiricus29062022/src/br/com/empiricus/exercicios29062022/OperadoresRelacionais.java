package br.com.empiricus.exercicios29062022;

import java.util.Scanner;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			;
			int idade0, idade1, idade2, idade3, idade4, idade5;
			System.out.print("Digite a sua idade: ");
			idade0 = entrada.nextInt();
			System.out.print("Digite a sua idade: ");
			idade1 = entrada.nextInt();
			System.out.print("Digite a sua idade: ");
			idade2 = entrada.nextInt();
			System.out.print("Digite a sua idade: ");
			idade3 = entrada.nextInt();
			System.out.print("Digite a sua idade: ");
			idade4 = entrada.nextInt();
			System.out.print("Digite a sua idade: ");
			idade5 = entrada.nextInt();

			boolean maiorIdade0 = idade0 > 18;
			boolean maiorIdade1 = idade1 < 18;
			boolean maiorIdade2 = idade2 <= 18;
			boolean maiorIdade3 = idade3 >= 18;
			boolean maiorIdade4 = idade4 != 18;
			boolean maiorIdade5 = idade5 == 18;
			System.out.println(maiorIdade0);
			System.out.println(maiorIdade1);
			System.out.println(maiorIdade2);
			System.out.println(maiorIdade3);
			System.out.println(maiorIdade4);
			System.out.println(maiorIdade5);
		}

	}

}
