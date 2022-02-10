package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;


public class Tetraedro extends Tridimensional{
	private double aresta;
	
	public Tetraedro() {
		this.aresta = 0;
	}
	public Tetraedro(double aresta) {
		this.aresta = aresta;
	}
	
	public double getAresta() {
		return aresta;
	}
	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public double obterArea() {
		
		return (Math.pow(aresta, 2) * Math.sqrt(3));
	}
	
	@Override
	public double obterVolume() {
		
		return ((Math.pow(aresta, 3) * Math.sqrt(2)) / 12);
	}
}
