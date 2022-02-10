package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;
public class Reserva {
	private String cliente; //nome do cliente/hospede
	private int[] data = new int[3]; //vetor que registra a data (d/m/a) da reserva
	
	//construtores
	public Reserva() {
		this.cliente = null;
		this.data[0] = 0;
		this.data[1] = 0;
		this.data[2] = 0;
	}
	
	public Reserva(String cliente, int dia, int mes, int ano) {
		this.cliente = cliente;
		this.data[0] = dia;
		this.data[1] = mes;
		this.data[2] = ano;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}
}
