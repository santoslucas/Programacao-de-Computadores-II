package banco_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public abstract class ContaBancaria {
	protected String nome;
	protected int numConta;
	protected double saldo;
	
	ContaBancaria(){
		this.nome = ("");
		this.numConta = 0;
		this.saldo = 0;
	}
	ContaBancaria(String nome, int numConta, double saldo){
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract boolean sacar(double saque);
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
}
