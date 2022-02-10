package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

import java.util.Random;

public class Chave {
	public int deslocamento;
	public String[] alfabeto;
	private Random aleatorio;
	
	public Chave() {
		this.aleatorio = new Random();
		this.deslocamento = this.aleatorio.nextInt(26) + 1; //CRIA UM NUMERO RANDOMICO ENTRE 1 E 26 (LETRAS DO ALFABETO)
		this.alfabeto = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
									"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
									"w", "x", "y", "z"};
	}
	
	public Chave(int deslocamento) {
		this.deslocamento = deslocamento;
		this.alfabeto = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
									"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
									"w", "x", "y", "z"};
	}

	public int getDeslocamento() {
		return deslocamento;
	}

	public void setDeslocamento(int deslocamento) {
		this.deslocamento = deslocamento;
	}

	public String[] getAlfabeto() {
		return alfabeto;
	}

	public void setAlfabeto(String[] alfabeto) {
		this.alfabeto = alfabeto;
	}

	public Random getAleatorio() {
		return aleatorio;
	}

	public void setAleatorio(Random aleatorio) {
		this.aleatorio = aleatorio;
	}
	
	
}
