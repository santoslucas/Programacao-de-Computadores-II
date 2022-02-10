package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class Circulo extends Bidimensional{
	private double raio;
	
	public Circulo() {
		this.raio = 0;
	}
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double obterArea() {
		
		return ((3.14) * Math.pow(this.raio, 2));
	}
}
