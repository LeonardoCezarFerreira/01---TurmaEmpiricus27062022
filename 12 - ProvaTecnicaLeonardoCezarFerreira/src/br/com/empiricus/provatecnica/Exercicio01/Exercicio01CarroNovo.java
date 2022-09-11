package br.com.empiricus.provatecnica.Exercicio01;

import java.util.Scanner;

public class Exercicio01CarroNovo {
//Leonardo Cezar Ferreira
	public static void main(String[] args) {
		double CarroNovo, ValorFinal;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor de fábrica do veículo: R$ ");
        CarroNovo = entrada.nextDouble();

        ValorFinal = (CarroNovo + CarroNovo*0.28 + CarroNovo*0.45);

        System.out.println("O valor final de pagamento do veículo é de: R$ " + ValorFinal);
        entrada.close();
	}

}
