package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class Terceirizado extends Empregado {
	private double horasTrabalhadas;
	
	public Terceirizado(String nome, String sobrenome, int numIdent) {
		super(nome, sobrenome, numIdent);
		this.horasTrabalhadas = 0;
	}
	public Terceirizado(String nome, String sobrenome, int numIdent, double horasTrabalhadas) {
		super(nome, sobrenome, numIdent);
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public double getValorAPagar(int diaPagto, int mesPagto) {
		double valor = ((horasTrabalhadas) * (ControlePagamento.HORA));
		
		return valor;
	}
}
