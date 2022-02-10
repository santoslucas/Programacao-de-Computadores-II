package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class Comissionado extends Empregado {
	private double valorVendas;
	
	public Comissionado(String nome, String sobrenome, int numIdent) {
		super(nome, sobrenome, numIdent);
		this.valorVendas = 0;
	}
	public Comissionado(String nome, String sobrenome, int numIdent, double valorVendas) {
		super(nome, sobrenome, numIdent);
		this.valorVendas = valorVendas;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	@Override
	public double getValorAPagar(int diaPagto, int mesPagto) {
		double valor = ((this.valorVendas) * (0.06));
		
		return valor;
	}
	
	
}
