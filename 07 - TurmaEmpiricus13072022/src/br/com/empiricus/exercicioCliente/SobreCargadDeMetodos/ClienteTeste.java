package br.com.empiricus.exercicioCliente.SobreCargadDeMetodos;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Leonardo");
		c1.setPedido(102);
		c1.setValor(2550);
		
		c1.imprimirPedido(c1.getNome(), c1.getPedido(), c1.getValor());
	}

}
