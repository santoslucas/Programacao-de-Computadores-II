public class Pessoa {
	private String nome;//Declaração de cada string
	private Pessoa pai;
	private Pessoa mae;
	
	public Pessoa(String nome, String pai, String mae) {//Declaração de um método para preencher os nomes, a mãe e o pai.
		this.nome = nome;
		this.pai = new Pessoa(pai);
		this.mae = new Pessoa(mae);
	}
	
	public Pessoa(String nome) {//Declaração de um método para quando surgir uma new pessoa sem pai e sem mãe, apenas com um o parametro nome.
		this.nome = nome;
		this.pai = null;
		this.mae = null;
	}
	
	public String getNome() {//Método para pegar  e mostrar o nome.
		return nome;
	}
	public void setNome(String nome) {//Método para colocar o nome da pessoa.
		this.nome = nome;
	}
	
	public Pessoa getPai() {//Método para pegar  e mostrar o nome do pai.
		return pai;
	}
	public void setPai(Pessoa pai) {//Método para colocar o nome do pai pessoa.
		this.pai = pai;
	}

	public Pessoa getMae() {//Método para pegar  e mostrar o nome da mãe.
		return mae;
	}
	public void setMae(Pessoa mae) {//Método para colocar o nome da mãe pessoa.
		this.mae = mae;
	}
	
	public void compararPessoas(Pessoa pessoa){// Declaração de um método para comparar pessoas, ver se elas são iguais
		if(this.mae != null && pessoa.mae != null) { //Para não acontecer erro durante a execução é feito esse if.
			if(this.equals(pessoa) && this.mae.equals(pessoa.mae)) {//comparar se as pessaos são as mesmas.
				System.out.println(this.nome+" e "+pessoa.nome+" são a mesma pessoa.");
			}
		}
	}
	
	public void verificarIrmas(Pessoa pessoa){//Declaração de um método para verificar irmandade.
		if(this.pai != null && this.mae != null && pessoa.pai != null && pessoa.mae != null) {//Para não acontecer erro durante a execução é feito esse if.
			if(this.pai.nome.equals(pessoa.pai.nome) && this.mae.nome.equals(pessoa.mae.nome) && this.nome!=pessoa.nome) {//Caso a pessoa tenha mesma mãe e pai e o nome seja diferente.
				System.out.println(this.nome+" e "+pessoa.nome+" são irmãos(ãs).");
			}
		}
	}
	
	public void verificarAntecessor(Pessoa pessoa){//Método para verificar antecessor.
		if(this.pai != null && this.mae != null) {//Para não acontecer erro durante a execução é feito esse if.
			if(this.pai.equals(pessoa) || this.mae.equals(pessoa)) {//para ver se a pessoa é pai de alguém, compara-se os nomes.
				System.out.println(this.nome+" é filho(a) de "+pessoa.nome);
				
			}
			else {
				if(this.pai.pai != null && this.pai.mae != null) {//Para não acontecer erro durante a execução é feito esse if.
					if(this.pai.pai.nome.equals(pessoa.nome) || this.pai.mae.nome.equals(pessoa.nome)) {//verificar se é o avõ e avó de parte de pai
						System.out.println(this.nome+" é neto(a) de "+pessoa.nome);
					}
				}
				else {
					if(this.mae.pai != null && this.mae.mae != null) {//Para não acontecer erro durante a execução é feito esse if.
						if(this.mae.pai.nome.equals(pessoa.nome) || this.mae.mae.nome.equals(pessoa.nome)) {//verificar se é o avõ e avó de parte de mãe
							System.out.println(this.nome+" é neto(a) de "+pessoa.nome);
						}
					}
				}
			}
		}
	}
}