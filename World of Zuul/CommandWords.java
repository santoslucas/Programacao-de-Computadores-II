package source;
/**
 * @author Lucas Santos, Marcela Caram, Sulamita Costa, Vinicius Pinheiro
 * @since jan 2022.
 */

public class CommandWords
{
   
    private static final String validCommands[] = {
        "go", "quit", "help", "look", "procurar", "comer"
    };
    private Command command;

    public CommandWords() {
    	
    }
    
    public CommandWords(String comando)
    {
        this.command = new Command(comando, null);
    }

    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
    
        return false;
    }
    
    /**
     * Retorna os comandos disponíveis.
     * Dessa forma, delegamos a função de exbir/verificar os comandos para essa classe.
     * @return
     */
    public static String[] getValidCommands() {
        return validCommands;
    }
    
    /**
     * Verifica qual o comando digitado.
     * @return
     */
    public int verificarComando() {
    	int retorno = 5;
    	
    	if (this.command.getCommandWord().equals("help"))
    		retorno = 0;
        else if (this.command.getCommandWord().equals("go"))
        	retorno = 1;
        else if (this.command.getCommandWord().equals("quit"))
        	retorno = 2;
        else if(this.command.getCommandWord().equals("procurar"))
        	retorno = 3;
        else if(this.command.getCommandWord().equals("comer"))
        	retorno = 4;
    	
    	return retorno;
    }

}
