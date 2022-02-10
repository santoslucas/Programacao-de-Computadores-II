package source;

import java.util.ArrayList;

/**
 * Esta classe é utilizada para criar personagens em quartos (<b>Room</b>) e administrá-los.
 * 
 * @author Lucas Santos, Marcela Caram, Sulamita Costa, Vinicius Pinheiro
 * @since jan 2022.
 */
public class Character {
	
	/**
	 * Nome do personagem.
	 */
	private String name;
	/**
	 * Boolean que verifica se ele é inimigo.
	 */
	private boolean enemy;
	/**
	 * Boolean que verifica se ele está vivo.
	 */
	private boolean alive;
	/*/
	 * Descrição do personagem/fala.
	 */
	private String descricao;
	
	/**
	 * Método construtor sem parametros.
	 */
	public Character() {
		this.name = ("");
		this.descricao = ("");
		this.enemy = false;
		this.alive = true;
	}
	
	/**
	 * Método construtor.
	 * @param name
	 * @param descricao
	 * @param enemy
	 */
	public Character(String name, String descricao, boolean enemy) {
		this.name = name;
		this.descricao = descricao;
		this.enemy = enemy;
		this.alive = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isEnemy() {
		return enemy;
	}

	public void setEnemy(boolean enemy) {
		this.enemy = enemy;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	/**
	 * Verifica se o jogador possui a "Sword" e o "Mushroom" para matar o Dragão.
	 * @param sword
	 * @param mushroom
	 * @return
	 */
	public boolean defeatBoss(ArrayList<Item> sword, ArrayList<Item> mushroom) {
		int cont = 0;
		
		for(Item item : sword) {
			if(item.getName().equals("Sword") && item.isCollected()) {
				cont++;
			}
		}
		
		for(Item item : mushroom) {
			if(item.getName().equals("Mushroom") && item.isCollected()) {
				cont++;
			}
		}
		
		if(cont >= 2) 
			return true;
		else
			return false;
		
	}
	
	/**
	 * Verifica se o jogador possui a "Sword" para matar o Troll.
	 * @param sword
	 * @return
	 */
	public boolean defeatMonster(ArrayList<Item> sword) {
		for(Item item : sword) {
			if(item.getName().equals("Sword") && item.isCollected()) {
				return true;
			}
		}
		return false;
	}
}
