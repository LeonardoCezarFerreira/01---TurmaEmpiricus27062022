package br.com.empiricus.classes.Encapsulamento;

public class Veiculo {
	//Atributos...
	private String modelo;
	private String marca;
	private int ano;
	private int velocidade = 0;
	
	//método --> serviço --> serve para acessar pra modificação o atributo
	public void setModelo(String modelo1) {
		this.modelo = modelo1;
	}
	//método --> serviço --> recuperação de dados que foram modificados
	public String getModelo() {
		return modelo;
	}
		
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	//Método...	
	void acelerar(int aceleracao) throws InterruptedException{
		for (int i = 0; i < aceleracao; i++) {
		velocidade++;
		System.out.println(i);
		Thread.sleep(300); 
		}
		
	}
	void freiar(int reduzir) throws InterruptedException {
		for (int i = velocidade; i > reduzir; i--) {
		velocidade--;
		System.out.println(i);
		Thread.sleep(100); 
	}
}
}
