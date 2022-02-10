package source;
/**
 * Essa clsse é utilizada para criar itens nos quartos (<b>Room</b>) e adiministrá-los.
 * 
 * @author Lucas Santos, Marcela Caram, Sulamita Costa, Vinicius Pinheiro
 * @since jan 2022.
 */

public class Item {
	/**
	 * Nome do item.
	 */
	private String name;
	/**
	 * Boolean que verifica se foi coletado ou não.
	 */
	private boolean collected;
	
	/**
	 * Método construtor sem parametros.
	 */
	public Item() {
		this.name = ("");
		this.collected = false;
	}
	
	/**
	 * Método construtor.
	 * @param name
	 * @param collected
	 */
	public Item(String name, boolean collected) {
		this.name = name;
		this.collected = collected;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCollected() {
		return collected;
	}

	public void setCollected(boolean collected) {
		this.collected = collected;
	}
}
