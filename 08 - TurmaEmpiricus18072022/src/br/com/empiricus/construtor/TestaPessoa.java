package br.com.empiricus.construtor;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o seu nome: ");
		String nome = entrada.next();
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
	
	Pessoa p1 = new Pessoa(nome, idade);
	//Pessoa p2 = new Pessoa();
	
	System.out.println("Meu nome é: " + p1.nome);
	System.out.println("Minha idade é: " + p1.idade);
	}

}