package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class Triangulo extends Bidimensional{
	private double base;
	private double altura;
	
	public Triangulo() {
		this.base = 0;
		this.altura = 0;
	}
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double obterArea() {
		return ((this.base * this.altura) / 2);
	}
}
