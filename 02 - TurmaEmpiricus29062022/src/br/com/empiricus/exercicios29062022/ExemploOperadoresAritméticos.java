package br.com.empiricus.exercicios29062022;

public class ExemploOperadoresAritméticos {

	public static void main(String[] args) {
		double x = 10;
		double y = 3;
		double z = 15;
		double resultado;
		double resultado1;
		double resultado2;
		double resultado3;
		double resultado4;

		resultado = x + y;
		resultado1 = x - y;
		resultado2 = x * y;
		resultado3 = z / y;
		resultado4 = x % y;

		System.out.println("Soma: " + resultado);
		System.out.println("Subtração: " + resultado1);
		System.out.println("Multiplicação: " + resultado2);
		System.out.printf("Divisão: %.1f\n", resultado3);
		System.out.println("Resto da Divisão: " + resultado4);

	}

}
