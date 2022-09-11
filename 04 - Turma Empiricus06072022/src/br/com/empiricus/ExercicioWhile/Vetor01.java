package br.com.empiricus.ExercicioWhile;

public class Vetor01 {

	public static void main(String[] args) {
		int[] arrayVetor = new int [10];
		
		arrayVetor[5] = 1987;
		arrayVetor[6] = 1982;
		
		int x = 2016;
		
		arrayVetor[7] = x;
		
		arrayVetor[2] = 1000;
		
		int y = arrayVetor[2];
		
		for(int i = 0; i < arrayVetor.length; i++) {
		System.out.println(i + " - " + arrayVetor[i]);
	}
System.out.println("Variável Y: " + y);
}
}
