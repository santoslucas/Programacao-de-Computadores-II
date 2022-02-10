package source;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * @author Lucas Santos, Marcela Caram, Sulamita Costa, Vinicius Pinheiro
 * @since jan 2022.
 */

public class Room 
{
    public String description;
    /**
     * Detalhes da sala utilizados no método "procurar()" na main.
     */
    private String details;
    /**
     * ArrayList de <b>Item</b> pertencentes a sala.
     */
    private ArrayList<Item> roomItem;
    /**
     * Personagem pertencente a sala.
     */
    private Character character;
    /**
     * <b>HashMap</b> que armazena as saídas e as relaciona a direção "south, north...".
     */
    private HashMap <String, String> saidas;
    
    /**
     * Método construtor.
     * @param description
     * @param details
     * @param character
     * @param north
     * @param east
     * @param south
     * @param west
     * @param up
     * @param down
     */
    public Room(String description, String details, Character character, String north, String east,
    			String south, String west, String up, String down)
    {
        this.description = description;
        this.details = details;
        this.roomItem = new ArrayList<Item>();
        this.character = character;
        this.saidas = new HashMap<String, String>();
        
        this.saidas.put("north" , north);
        this.saidas.put("east" , east);
        this.saidas.put("south" , south);
        this.saidas.put("west" , west);
        this.saidas.put("up" , up);
        this.saidas.put("down" , down);
    }
    
    public String getDescription()
    {
        return description;
    }
    
    
	public ArrayList<Item> getRoomItem() {
		return roomItem;
	}
	
	public void setRoomItem(ArrayList<Item> roomItem) {
		this.roomItem = roomItem;
	}
	
	/**
	 * Método para adicionar um <b>Item</b> ao ArrayList Item .
	 * @param item
	 */
	public void addItem(Item item) {
		this.roomItem.add(item);
	}
	
	public HashMap<String, String> getSaidas() {
		return saidas;
	}

	public void setSaidas(HashMap<String, String> saidas) {
		this.saidas = saidas;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}
