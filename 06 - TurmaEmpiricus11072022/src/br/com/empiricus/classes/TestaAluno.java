package br.com.empiricus.classes;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();
		
		al1.nome = "Leonardo";
		al1.idade = 35;
		al1.curso = "Java - Puro";
		
		System.out.println(al1.nome);
		System.out.println(al1.idade);
		System.out.println(al1.curso);
		al1.estudar();
		
		al2.nome = "Lorena";
		al2.idade = 5;
		al2.curso = "Educação Infatil - O";
		
		System.out.println();
		
		System.out.println(al2.nome);
		System.out.println(al2.idade);
		System.out.println(al2.curso);
		al2.estudar();
	}

}
