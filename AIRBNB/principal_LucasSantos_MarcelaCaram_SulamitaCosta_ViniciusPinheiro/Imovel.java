package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;
public class Imovel {
	private String nome; //nome do imovel
	private String proprietario; //nome do proprietario
	private Reserva[] reservas; //vetor da classe Reserva
	private int indice; //indice que contabiliza o numero de reservas feitas no imovel (max: 3)
	private double preco; //preco do aluguel
	
	//construtores
	public Imovel() {
		this.nome = null;
		this.proprietario = null;
		this.reservas = new Reserva[3];
		this.indice = 0;
		this.preco = 0;
	}
	
	public Imovel(String nome, String proprietario, double preco) {
		this.nome = nome;
		this.proprietario = proprietario;
		this.reservas = new Reserva[3];
		this.indice = 0;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public Reserva[] getReservas() {
		return reservas;
	}

	public void setReservas(Reserva[] reservas) {
		this.reservas = reservas;
	}
	
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	/*  
	  	Metodo para reservar uma data,
		Enquanto o indice nao atingir o numero maximo de reservas,
		e' possivel realizar uma nova.
		
		Para isso e´ criado um objeto Reserva, contendo o cliente e a data
		nos parametros do construtor.
	*/
	public void reservar(String cliente, int dia, int mes, int ano) {
		if(this.indice < 3) {
			this.reservas[this.indice] = new Reserva(cliente, dia, mes, ano);
			this.indice++;
		}
	}
	
	// Calcula e retorna o faturamento do Proprietario por meio da formula:
	// preco x numero de reservas(indice) x 70%(lucro)
	public double faturamentoProp() {
		double faturaProp = ((this.preco)*(this.indice)*0.7);
		return faturaProp;
	}
	
	//Calcula o faturamento do Cefet-Airbnb nos mesmos moldes do outro.
	public double faturamentoCEFET() {
		double faturaCEFET = ((this.preco)*(this.indice)*0.3);
		return faturaCEFET;
	}
}
