package br.com.empiricus.ExercicioDeAula;

import java.util.Random;

public class Exercício02 {
/*Exercício 2 - Um dado é lançado 10 vezes e o valor correspondente é anotado. 
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/
	public static void main(String[] args) {
		int [] dados = new int [10];
		int maior = 0, contadorMaior = 1;
		double media = 0;
		
		for (int i = 0; i < dados.length;i++) {
		Random dado = new Random();
		dados[i] = dado.nextInt(6)+1;
		System.out.println(dados[i]);
		}
		for (int i = 0; i < dados.length;i++) {
			media += dados[i];
			if (i == 0) {
				maior = dados[i];
			}
			else if (dados[i]>maior) {
				maior = dados[i];
				contadorMaior = 1;
			}
			else if (dados[i] == maior){
				contadorMaior++;
			}
			}
		System.out.println("O maior valor é: " + maior + ", e ele aparece: " + contadorMaior + " vez(es)");
		System.out.println("A média dos valores é: " + (media = media/dados.length));
		}

}
