package banco_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;
import java.util.ArrayList;

public class Banco {
	private ArrayList <ContaBancaria> contas;
	
	public Banco() {
		contas = new ArrayList<ContaBancaria>();
	}
	
	public Banco(ArrayList <ContaBancaria> contas) {
		this.contas = contas; 
	}
	
	public ArrayList<ContaBancaria> getContas() {
		return contas;
	}
	public void setContas(ArrayList<ContaBancaria> contas) {
		this.contas = contas;
	}
	
	public void addConta(ContaBancaria conta) {
		contas.add(conta);
	}
	
	public double somarSaldos() {
		double saldoTotal = 0;
		
		for(ContaBancaria objeto: contas) {
			saldoTotal += objeto.getSaldo();
		}
		
		return saldoTotal;
	}
}
