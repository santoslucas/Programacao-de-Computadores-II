/*
* CABEÇALHO *

Alunos: Lucas Santos Rodrigues (20213001521)
		Marcela Caram (20213006528)
		Sulamita Costa (20213001568)
		Vinícius Ferreira (20213005208)
		
		Prova Pratica 1
		
*/
package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Opercao a ser realizada e numero de imoveis
		int menu = 0, numImoveis = 0;
		//Criacao de um array de objetos do tipo Imovel
		Imovel[] imoveis = new Imovel[2];
		
		while(menu != 4) {
			System.out.println("O que deseja fazer?"
								+ "\n\t(1) Cadastrar imóvel."
								+ "\n\t(2) Reservar imóvel."
								+ "\n\t(3) Gerar faturamento."
								+ "\n\t(4) Sair.");
			
			menu = input.nextInt();
			
			//Cadastrar imovel
			if(menu == 1) {
				String imovel, proprietario;
				int preco;
				
				System.out.println("Qual o nome do imovel?");
				input.nextLine();
				imovel = input.nextLine();
				
				System.out.println("Qual o nome do proprietario?");
				proprietario = input.nextLine();
				
				System.out.println("Qual o preço da hospedagem?");
				preco = input.nextInt();
				
				//Criacao de um objeto do tipo imovel
				imoveis[numImoveis] = new Imovel (imovel, proprietario, preco);
				//contabiliza +1 imovel
				numImoveis++;
				
				System.out.println("Imóvel cadastrado :)\n");
			}
			
			//Reservar imovel
			/*
			 * Primeiro "For" e' para comparar a String lida na busca,
			 * com todos os nomes de imoveis registrados.
			 * 
			 * Caso o nome seja igual e' lido do teclado o nome do cliente/hospede e a data da reserva
			 * 
			 * Caso a data ja exista em algum objeto reserva, que por sua vez esta dentro do objeto imovel,
			 * "dataDisponivel = false".
			 * 
			 * Assim, caso "dataDisponivel = false" e' informado ao usuario que a data esta indisponivel
			*/
			if(menu == 2) {
				String imovel;
				
				System.out.println("Qual o nome do imóvel?");
				input.nextLine();
				imovel = input.nextLine();
				
				//passa por todos imoveis registrados
				for(int i=0; i<numImoveis; i++) {
					//compara as strings
					if(imovel.equals(imoveis[i].getNome())) {
						
						String cliente;
						int[] data = new int[3]; //(d/m/a)
						boolean dataDisponivel = true;
						
						System.out.println("Qual o nome do cliente/hospede?");
						cliente = input.nextLine();
						
						System.out.println("Qual a data da reserva?");
						data[0] = input.nextInt();
						data[1] = input.nextInt();
						data[2] = input.nextInt();
						
						//verifica se a data ja tem uma reserva
						for(int j=0; j<imoveis[i].getIndice(); j++) {
							
							//se da data ja existir, "dataDisponivel = false".
							if(imoveis[i].getReservas()[j].getData()[0] == data[0] &&
								imoveis[i].getReservas()[j].getData()[1] == data[1] &&
								imoveis[i].getReservas()[j].getData()[2] == data[2]) {
								dataDisponivel = false;
							}
						}
						
						//se "dataDisponivel = true".
						if(dataDisponivel) {
							imoveis[i].reservar(cliente, data[0], data[1], data[2]);
							System.out.println("Reserva cadastrada :)\n");
						}
						else {
							System.out.println("Essa data já possui uma reserva :(\n");
						}
					}
				}
			}
			
			//Gerar faturamento
			if(menu == 3) {
				double faturamentoCEFET = 0;
				System.out.println("Faturamentos:");
				
				System.out.println("\tProprietarios:");
				for(int i=0; i<numImoveis; i++) {
					
					//imprime o faturamento de cada proprietario
					System.out.println("\t\t" + imoveis[i].getProprietario() + " - R$ " + imoveis[i].faturamentoProp());
					//Obtem o faturamento do Cefet-Airbnb somando de 30% de todos faturamentos dos proprietarios por meio do metodo faturamentoCEFET() da classe imovel
					faturamentoCEFET += imoveis[i].faturamentoCEFET();
					
					//imprime o faturamento do Cefet-Airbnb ao final do for
					if(i == (numImoveis-1)) {
						System.out.println("\n\tFaturamento CEFET-Airbnb - R$ " + faturamentoCEFET + "\n");
					}
				}
			}
		}
		System.out.println("Até a próxima :)");
		
		input.close();
	}
}