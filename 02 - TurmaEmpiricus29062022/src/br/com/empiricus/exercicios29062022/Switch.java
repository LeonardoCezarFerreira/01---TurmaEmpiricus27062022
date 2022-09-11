package br.com.empiricus.exercicios29062022;

public class Switch {

	public static void main(String[] args) {
		int mes = 1;
		switch (mes) {
		case 1: // são dois pontos, na apostila consta ponto e vírgula
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		default:
			System.out.println("Mês inexistente");
		}
	}

}
