package br.com.empiricus.exercicioHerança;

public class Cachorro extends Animal {
	@Override//sobreescrita
	public void comer() {
		System.out.println("Cachorro comendo...");
			}
	public void somAnimal() {
		System.out.println("Som do Cachorro...: Au Au");
	}

}
