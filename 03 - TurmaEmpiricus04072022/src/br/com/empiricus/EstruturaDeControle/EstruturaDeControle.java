package br.com.empiricus.EstruturaDeControle;
import java.util.Scanner;

public class EstruturaDeControle {

	public static void main(String[] args) {
		try(Scanner entrada = new Scanner(System.in)){;
		int x, y, z;
		
		System.out.print("Digite o valor de X: ");
		x = entrada.nextInt();
		System.out.print("Digite o valor de Y: ");
		y = entrada.nextInt();
		System.out.print("Digite o valor de Z: ");
		z = entrada.nextInt();
		
		if (x > y && x > z) {
			System.out.println("X é o Maior");
	}
		else if (y > x && y > z){
		System.out.println("Y é o Maior");
	}	
		else if (z > x && z > y){
			System.out.println("Z é o Maior");
		}
		else {
			System.out.println("Os valores são iguais");
		}
		}
	}
}
