package banco_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class ContaCorrenteEspecial extends ContaBancaria{
	private double limite;

	public ContaCorrenteEspecial() {
		super();
		this.limite = 0;
	}
	public ContaCorrenteEspecial(String nome, int numConta, double saldo, double limite) {
		super(nome, numConta, saldo);
		this.limite = limite;
	}

	@Override
	public String getNome() {
		return super.getNome();
	}
	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}
	@Override
	public int getNumConta() {
		return super.getNumConta();
	}
	@Override
	public void setNumConta(int numConta) {
		super.setNumConta(numConta);
	}
	@Override
	public double getSaldo() {
		return super.getSaldo();
	}
	@Override
	public void setSaldo(double saldo) {
		super.setSaldo(saldo);
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(double saque) {
		if(saque <= super.saldo) {
			super.saldo -= saque;
			return true;
		}
		
		else {
			if((super.saldo - saque) >= (-limite)) {
				super.saldo -= saque;
				return true;
			}
			
			else {
				return false;
			}
		}
	}
	
	@Override
	public void depositar(double deposito) {
		super.depositar(deposito);
	}
}
