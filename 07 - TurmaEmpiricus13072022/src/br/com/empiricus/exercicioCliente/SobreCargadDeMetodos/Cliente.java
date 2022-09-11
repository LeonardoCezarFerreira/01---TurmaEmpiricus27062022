package br.com.empiricus.exercicioCliente.SobreCargadDeMetodos;

public class Cliente {
	private String nome;
	private int pedido;
	private double valor;
	
	public String getNome() {
	return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	void imprimirPedido(String nome, int pedido, double valor) {
		System.out.printf("Cliente: %s%nPedido: %d%nValor:%.2f", nome, pedido, valor);
	}

}
