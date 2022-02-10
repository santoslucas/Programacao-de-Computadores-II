package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class AssalariadoComissionado extends Comissionado {
	private double percentualBonus;
	
	public AssalariadoComissionado (String nome, String sobrenome, int numIdent) {
		super(nome, sobrenome, numIdent);
		this.percentualBonus = 0;
	}
	public AssalariadoComissionado (String nome, String sobrenome, int numIdent, double valorVendas) {
		super(nome, sobrenome, numIdent);
		this.percentualBonus = (valorVendas * 0.06);
	}
	public double getPercentualBonus() {
		return percentualBonus;
	}
	public void setPercentualBonus(double percentualBonus) {
		this.percentualBonus = percentualBonus;
	}
	
	@Override
	public double getValorAPagar(int diaPagto, int mesPagto) {
		double valor = ((ControlePagamento.SALARIO) + (this.percentualBonus));
		
		return valor;
	}
}
