package br.com.empiricus.ExercicioHerança18072022;

import java.util.Scanner;

public class TestaTodoMundo {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner nome = new Scanner(System.in);
		Scanner idade = new Scanner(System.in);
		Scanner salario = new Scanner(System.in);
		Scanner endereco = new Scanner(System.in);
		Scanner disciplina = new Scanner(System.in);
		
		Professor prof1 = new Professor();
		
		prof1.setNome("Leonardo");
		prof1.setIdade(35);
		prof1.setSalario(1000.00);
		prof1.setEndereço("Rua Vitalina Moura, 180");
		prof1.setDisciplina("Java");
		
		System.out.println("Digite o Nome do Professor(a):" + prof1.getNome());
		System.out.println("Digite a Idade:" + prof1.getIdade());
		System.out.println("Informe o Salário:" + prof1.getSalario());
		System.out.println("Endereço:" + prof1.getEndereço());
		System.out.println("Nome da Disciplina:" + prof1.getDisciplina());

	}

}
