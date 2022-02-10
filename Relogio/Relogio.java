
public class Relogio {
	private Contador hora;
	private Contador minuto;
	private String displayFormatado;
	private boolean formato24h;
	
	public Relogio(){
		this.hora = new Contador(24, 0);
		this.minuto = new Contador(60, 0);
	}
	
	public Relogio(int hora, int minuto) {
		this.hora = new Contador(24, hora);
		this.minuto = new Contador(60, minuto);
	}
	
	public Contador getHora() {
		return hora;
	}
	public void setHora(Contador hora) {
		this.hora = hora;
	}
	public Contador getMinuto() {
		return minuto;
	}
	public void setMinuto(Contador minuto) {
		this.minuto = minuto;
	}
	public String getDisplayFormatado() {
		return displayFormatado;
	}
	public void setDisplayFormatado(String displayFormatado) {
		this.displayFormatado = displayFormatado;
	}
	public boolean isFormato24h() {
		return formato24h;
	}
	public void setFormato24h(boolean formato24h) {
		this.formato24h = formato24h;
	}
	
	public void ticTac() {
		this.minuto.incrementar();
		
		if(this.minuto.getValor()==0) {
			this.hora.incrementar();
		}
	}
	
}
