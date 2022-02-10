package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class Quadrado extends Bidimensional{
	private double lado;
	
	public Quadrado() {
		this.lado = 0;
	}
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double obterArea() {
		return (Math.pow(this.lado, 2));
	}
}
