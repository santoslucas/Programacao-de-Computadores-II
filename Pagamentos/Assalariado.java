package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class Assalariado extends Empregado {
	private double horasExtras;
	
	public Assalariado(String nome, String sobrenome, int numIdent) {
		super(nome, sobrenome, numIdent);
		this.horasExtras = 0;
	}
	public Assalariado(String nome, String sobrenome, int numIdent, double horasExtras) {
		super(nome, sobrenome, numIdent);
		this.horasExtras = horasExtras;
	}
	public double getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	@Override
	public double getValorAPagar(int diaPagto, int mesPagto) {
		double valor = ((ControlePagamento.SALARIO) + (horasExtras * ControlePagamento.HORA));
		
		return valor;
	}
}
