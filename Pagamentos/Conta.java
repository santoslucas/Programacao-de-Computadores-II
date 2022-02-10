package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class Conta extends Pagavel {
	protected int dia;
	protected int mes;
	protected double valor;
	
	public Conta() {
		this.dia = 0;
		this.mes = 0;
		this.valor = 0;
	}
	
	public Conta(int dia, int mes, double valor) {
		this.dia = dia;
		this.mes = mes;
		this.valor = valor;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public double getValorAPagar(int diaPagto, int mesPagto) {
		// TODO Auto-generated method stub
		return 0;
	}
}
