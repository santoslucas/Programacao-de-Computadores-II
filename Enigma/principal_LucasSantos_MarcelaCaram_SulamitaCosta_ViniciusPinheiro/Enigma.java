/*
* CABEÇALHO *

Alunos: Lucas Santos Rodrigues (20213001521)
		Marcela Caram (20213006528)
		Sulamita Costa (20213001568)
		Vinícius Ferreira (20213005208)
		
		Atividade 6 - Enigma
		
*/
package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;
import java.util.Scanner;

public class Enigma {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Frases armazenadas para serem decifradas pelo usuário
		String[] frases = new String[] {"cefet eh demais",
										"pc2 melhor materia",
										"java melhor que c"};
		
		CifraDeCesar charada = new CifraDeCesar();
		
		int menu = 0;
		
		// *** MENU ***
		while(menu != 3) {
			System.out.println("O que deseja fazer?"
								+ "\n\t(1) Cifrar uma mensagem."
								+ "\n\t(2) Decifrar uma mensagem."
								+ "\n\t(3) Sair.");
			
			menu = input.nextInt();
			
			//CIFRAR
			if(menu == 1) {
				System.out.println("Qual a mensagem que deseja cifrar?");
				input.nextLine();
				String mensagem = input.nextLine().toLowerCase();
				
				System.out.println("Qual o deslocamento?");
				charada.getChave().setDeslocamento(input.nextInt());
				
				System.out.println("\nFrase cifrada: " + charada.cifrar(mensagem));
				
				System.out.println("Frase armazenada!\n");
			}
			
			//DECIFRAR
			if(menu == 2) {
				System.out.println("Você quer:"
								+ "\n\t(1) Decifrar uma mensagem manualmente."
								+ "\n\t(2) Quer que o programa decifre uma mensagem.");
				int tipo = input.nextInt();
				
				// DECIFRAGEM PELO USUÁRIO
				if(tipo == 1) {
					System.out.println("Escolha um número: 1, 2, 3");
					int numFrase = (input.nextInt() - 1);
					
					charada = new CifraDeCesar(); //gera uma cifra nova com deslocamento randomico
					System.out.println("Frase: " + charada.cifrar(frases[numFrase]));
					System.out.println("Deslocamento: " + charada.getChave().getDeslocamento());
					
					try{
						input.nextLine();
						charada.verificarDesafio(input.nextLine(), charada.cifrar(frases[numFrase]));
						System.out.println("Resposta correta! :)\n");
					}
					catch(DecifragemInvalidaException e) {
						e.printStackTrace();
					}
				}
				
				// DECIFRAGEM PELO PROGRAMA
				else {
					if(tipo == 2) {
						System.out.println("Qual a mensagem que deseja decifrar?");
						input.nextLine();
						String mensagem = input.nextLine().toLowerCase();
						
						System.out.println("Qual o deslocamento?");
						charada.getChave().setDeslocamento(input.nextInt());
						
						System.out.println("\nFrase decifrada: " + charada.decifrar(mensagem));
					}
				}
			}
		}
		
		input.close();
		System.out.println("Já vai? :(\nAté mais...");
	}
}
