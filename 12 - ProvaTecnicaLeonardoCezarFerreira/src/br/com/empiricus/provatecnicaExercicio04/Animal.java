package br.com.empiricus.provatecnicaExercicio04;
//Leonardo Cezar Ferreira
public class Animal {
	
		String nome;
		int idade;
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public void emitirSom()
		{
			System.out.println("Som do Animal: ");
		}
	}
	

	


