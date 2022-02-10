
public class Refeicao {
	private String descricao;
	private double calorias;
	
	public Refeicao(String descricao, double calorias) {
		this.descricao = descricao;
		this.calorias = calorias;
	}
	
	public Refeicao() {
		this.descricao = null;
		this.calorias = 0;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getCalorias() {
		return calorias;
	}
	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}
}
