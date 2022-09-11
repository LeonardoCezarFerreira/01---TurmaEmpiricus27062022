package br.com.digitalhouse.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao03 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite o Segundo número: ");
		int numero2 = sc.nextInt();
			
		int divisao =  numero1/numero2;
		
		System.out.println("O resultado é: " + divisao);
		sc.close();
		}
		catch (ArithmeticException e) {
		System.out.println("Não é possível dividir por 0");
		}
		catch (InputMismatchException e) {
		System.out.println("Não é possível dividir por 0");
		}
		finally {
			System.err.println("\nFinalizando o Programa");
		}
	}
}
		
		
	



