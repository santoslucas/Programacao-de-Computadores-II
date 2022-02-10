package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class Cubo extends Tridimensional{
	private double lado;
	
	public Cubo() {
		this.lado = 0;
	}
	public Cubo(double lado) {
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
		
		return (6 * Math.pow(lado, 2));
	}
	
	@Override
	public double obterVolume() {
		
		return (Math.pow(lado, 3));
	}
}
