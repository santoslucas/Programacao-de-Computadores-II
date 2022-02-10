package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class DecifragemInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public DecifragemInvalidaException() {
		super("Erro ao decifrar a mensagem :(\n");
	}
}
