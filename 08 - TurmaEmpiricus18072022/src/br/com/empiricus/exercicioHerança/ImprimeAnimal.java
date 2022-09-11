package br.com.empiricus.exercicioHerança;

	public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaAnimal t = new TestaAnimal();
		Cachorro cr = new Cachorro();
		
		
		t.fazerAnimalComer(new Cachorro());
		t.fazerAnimalComer(new Tigre());
	}

}
