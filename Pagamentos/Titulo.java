package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class Titulo extends Conta{
	
	public Titulo(int dia, int mes, double valor){
		super(dia, mes, valor);
	}
	
	public double getValorAPagar(int diaPagto, int mesPagto) {
		double valorJuros = 0;
		
		if(this.mes < mesPagto) {
			valorJuros = (this.valor * 1.1);
		}
		
		else {
			if(this.mes == mesPagto && this.dia < diaPagto) {
				valorJuros = (this.valor * 1.1);
			}
		}

		return valorJuros;
	}
	
}
