package br.com.empiricus.exercicios29062022;

public class Blocos {

	public static void main(String[] args) {
		int x = 10, w = 1, y = 50; // Se tirarmos a variável y sistema apresenta erro.
		if (x > w)
			;
		{
			// int y = 50; //Como a variável está fora do Bloco sistema apresenta erro.
			System.out.println("dentro do bloco");
			System.out.println("x:" + x);
			System.out.println("y:" + y);
		}
		System.out.println("w:" + w);
		// System.out.println("y:" + y); //erro variável não conhecida
	}

}
