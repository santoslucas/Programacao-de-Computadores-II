package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class CifraDeCesar {
	private Chave chave;
	
	public CifraDeCesar() {
		this.chave = new Chave();
	}
	
	public CifraDeCesar(int deslocamento, String mensagem) {
		this.chave = new Chave(deslocamento);
	}
	
    public Chave getChave() {
		return chave;
	}

	public void setChave(Chave chave) {
		this.chave = chave;
	}
	
	/*
	 * Primeiro a String é transformada em um array do tipo char, para acessarmos cada letra.
	 * Posteriormente verifica cada posicao de cada letra da frase no alfabeto.
	 * Se a letra bater com alguma do alfabeto acharNoAlfabeto será true.
	 * Então, é realizado o deslocamento desse char e ele é salvo em "mensagemDecifrada".
	 * 
	 * Senão bater com uma letra do alfabeto se trata de um espaço ou um caracter especial, portanto acharNoAlfabeto será false.
	 * Então, esse char é salvo sem alteracções em "mensagemDecifrada".
	 * 
	 * "mensagem" recebe "mensagemDecifrada" e é retornada
	*/
	public String cifrar(String mensagem) {
		char[] mensagemCifrada = new char[mensagem.length()];
		int posicaoLetra = 0;
		boolean acharNoAlfabeto = false;
		
		for(int i=0; i<(mensagem.length()); i++){
	
			for(int j=0; j<26; j++) {
				if(mensagem.charAt(i) == chave.alfabeto[j].charAt(0)) {
					posicaoLetra = j;
					acharNoAlfabeto = true;
					break;
				}
			}
			
			//deslocamento
			if(acharNoAlfabeto) {
				for(int j=0; j<this.chave.deslocamento; j++) {
					posicaoLetra++;
					
					//chegou em Z
					if(posicaoLetra>26) {
						posicaoLetra = 0; //vai para o A
					}
				}
				mensagemCifrada[i] = chave.alfabeto[posicaoLetra].charAt(0);
			}
			
			else {
				mensagemCifrada[i] = mensagem.charAt(i);
			}
			
			acharNoAlfabeto = false;
			
		}
		
		mensagem = new String(mensagemCifrada);
		
		return mensagem;
	}
	
	//SEGUE A MESMA LOGICA DE CIFRAR 
	public String decifrar(String mensagem) {
		char[] mensagemDecifrada = new char[mensagem.length()];
		int posicaoLetra = 0;
		boolean acharNoAlfabeto = false;
		
		for(int i=0; i<(mensagem.length()); i++){
			
			for(int j=0; j<26; j++) {
				if(mensagem.charAt(i) == chave.alfabeto[j].charAt(0)) {
					posicaoLetra = j;
					acharNoAlfabeto = true;
					break;
				}
			}
			
			if(acharNoAlfabeto) {
				for(int j=0; j<this.chave.deslocamento; j++) {
					posicaoLetra--;
					
					//chegou em A
					if(posicaoLetra<0) {
						posicaoLetra = 26; // vai para o Z
					}
				}
				mensagemDecifrada[i] = chave.alfabeto[posicaoLetra].charAt(0);
			}
			
			else {
				mensagemDecifrada[i] = mensagem.charAt(i);
			}
			
			acharNoAlfabeto = false;
		}
		
		mensagem = new String(mensagemDecifrada);
        
        
        return mensagem;
    }

    public boolean verificarDesafio(String tentativa,String mensagem) throws DecifragemInvalidaException {
        if(tentativa.equals(decifrar(mensagem))) {
            return true;
        }
        else {
            throw new DecifragemInvalidaException();
        }
    }
}