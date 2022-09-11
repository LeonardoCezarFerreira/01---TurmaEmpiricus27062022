package br.com.empiricus.provatecnica.Exercicio02;
//Leonardo Cezar Ferreira
import java.util.Scanner;

public class Exercicio02Triangulo {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){;
		
		double base, altura, area;

		System.out.println("Digite o valor da base: ");
		base = entrada.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = entrada.nextDouble();
	
		if( base > 0 && altura > 0){
		area = ((base*altura)/2);
		System.out.println("Area: " + area);
		}
		else if (base <=0 && altura <=0 ) {
		System.out.println("Os valores estão incorretos para calculo");
		}
	}
	}
}
		
	


		

		
		