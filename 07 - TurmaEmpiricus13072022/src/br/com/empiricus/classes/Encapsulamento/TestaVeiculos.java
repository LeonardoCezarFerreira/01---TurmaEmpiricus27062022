package br.com.empiricus.classes.Encapsulamento;

public class TestaVeiculos {

	public static void main(String[] args) throws InterruptedException {
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Veiculo();
		
		v1.setModelo("Prisma - Sedan");
		v1.setMarca("Chevrolet");
		v1.setAno (2016);
		
		v2.setModelo("Fiesta - Sedan");
		v2.setMarca("Ford");
		v2.setAno (2010);
		
		System.out.println(v1.getModelo());
		System.out.println(v1.getMarca());
		System.out.println(v1.getAno());
		//System.out.println(v1.velocidade);
		System.out.println();
		
		System.out.println(v2.getModelo());
		System.out.println(v2.getMarca());
		System.out.println(v2.getAno());
		System.out.println();
		
		v1.acelerar(3);
		v1.freiar(1);
	}

}
