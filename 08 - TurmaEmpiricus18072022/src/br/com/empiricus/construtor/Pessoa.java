package br.com.empiricus.construtor;

public class Pessoa {
	//Declaração de Atributos --> caracteristicas, variaveis
	String nome;
	int idade;
	//Construtor de Classe
	/*serve para inicializar configurações de classe, 
		para que o objeto não retorne nulo em alguns casos.*/
	
	Pessoa(String n, int i){
		System.out.println("Eu sou o construtor da classe Pessoa!!");
		nome = n;
		idade = i;
				
	}
}
