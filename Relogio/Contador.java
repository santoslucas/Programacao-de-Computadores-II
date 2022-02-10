
public class Contador {
	private int limite;
	private int valor;
	
	public Contador(int limite, int valor) {
		this.limite = limite;
		this.valor = valor;
	}
	public Contador(int limite) {
		this.limite = limite;
		this.valor = 0;
	}
	
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	//public String getValorFormatado() {
		//String valor = this.valor;
	//}
	
	public void incrementar() {
		this.valor++;
		
		if(valor == this.limite) {
			this.valor = 0;
		}
	}
}
