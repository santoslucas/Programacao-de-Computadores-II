package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class Esfera extends Tridimensional{
	private double raio;
	
	public Esfera() {
		this.raio = 0;
	}
	public Esfera(double raio) {
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
		
		return (4 * (3.14) * Math.pow(raio, 2));
	}
	
	@Override
	public double obterVolume() {
		
		return ((4 * (3.14) * Math.pow(raio, 3))/3);
	}
}
