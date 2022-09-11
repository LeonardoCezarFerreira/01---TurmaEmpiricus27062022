package br.com.empirirus.SobrecargaMetodo;

public class MinhaCalculadora {

	public static int soma(int numero1, int numero2) {
		System.out.println("Inteiros");
		return numero1 + numero2;
	}
	public static double soma(double numero1, double numero2) {
		System.out.println("Double");
		return numero1 + numero2;
	}
	public static double soma(double numero1, double numero2, double numero3) {
		System.out.println("3 valores double");
		return numero1 + numero2 + numero3;
}
}