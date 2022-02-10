
public class Cardapio {
	private Refeicao[][] cardapio;
	
	public Cardapio(int numDias, int numRefeicoes) {
		this.cardapio = new Refeicao[numDias][numRefeicoes];
	}

	public Refeicao[][] getCardapio() {
		return cardapio;
	}

	public void setCardapio(Refeicao[][] cardapio) {
		this.cardapio = cardapio;
	}
	
	//insere uma nova refeição
	public void inserirRefeicao(String descricao, double caloria, int numDia, int numRefeicao) {
		this.cardapio[numDia][numRefeicao] = new Refeicao(descricao, caloria);
	}
	
	//substitui uma refeição
	//caso ela não exista cria-se uma nova
	public void substituirRefeicao(String descricao, double caloria, int numDia, int numRefeicao) {
		if(this.cardapio[numDia][numRefeicao] != null) {
			this.cardapio[numDia][numRefeicao].setDescricao(descricao); 
			this.cardapio[numDia][numRefeicao].setCalorias(caloria);
		}
		else {
			this.cardapio[numDia][numRefeicao] = new Refeicao(descricao, caloria);
		}
	}
	
	//exclui uma refeição
	public void excluirRefeicao(int numDia, int numRefeicao) {
		this.cardapio[numDia][numRefeicao].setDescricao(null); 
		this.cardapio[numDia][numRefeicao].setCalorias(0);
	}
	
	//calcula as calorias totais das refeições
	public double calcularCalorias(int numDias, int numRefeicoes) {
		double totalCalorias = 0;
		
		for(int i=0; i<numDias; i++) {
			for(int j=0; j<numRefeicoes; j++) {
				totalCalorias += cardapio[i][j].getCalorias();
			}
		}
		return totalCalorias;
	}
}
