package br.com.empiricus.Exercicios11072022;

import java.util.Scanner;

public class TestaMetodo {
	
	static int numero3 = 10, numero4 = 5, multiplicacao, divisao;
	
	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){;
		System.out.println("Digite o número5: ");
		int x = entrada.nextInt();
		System.out.println("Digite o número6: ");
		int y = entrada.nextInt();
		
		metodo01();
		metodo02();
		metodo03();
		//metodo04();
		metodo05();
		metodo06(x,y);
		System.out.println(divisao);
		System.out.println(MetodoFora.metodo07(x, y));
		System.out.println(MetodoFora.metodo07(0, 20));
		}
		}
		public static void metodo01 (){
			System.out.println("Ola eu sou o Método 01....");
		}
		public static void metodo02() {
			int numero01 = 10, numero02 = 20, soma;
			soma = numero01 + numero02;
			System.out.println("Método 02 - Soma: " + soma);
		}
		public static void metodo03() {
			int numero01 = 100, numero02 = 50, subtracao;
			subtracao = numero01 - numero02;
			System.out.println("Método03 - Subtração: " + subtracao);
		}
		public static void metodo04() { 
		numero3 = 8;
		numero4 = 5;
		multiplicacao = numero3 * numero4;
		numero3 = 5;
		System.out.println("metodo04 variavel atualizada: " + numero3);
		}
		
		public static void metodo05() {
		metodo04();
		System.out.println("Multiplicação: metodo05 ...recebendo o valor do metodo04 = " + multiplicacao);
		}
		
		public static void metodo06(int numero5, int numero6) {
		divisao = numero5 / numero6;
		multiplicacao = numero5 * numero6;
		System.out.println("Uma outra multiplicação: " + multiplicacao);
		}
}
		
		
		
			

