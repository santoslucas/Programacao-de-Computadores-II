/*
* CABE�ALHO *

Alunos: Lucas Santos Rodrigues (20213001521)
		Marcela Caram (20213006528)
		Sulamita Costa (20213001568)
		Vin�cius Ferreira (20213005208)
		
Projeto: Card�pio
		
*/
import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Cardapio cardapioSemana = new Cardapio(7, 6); //cria um cardapio 7x6 (dias x refeicoes)
		
		int operacao = 0; //fun��es do menu
		double caloria; //variavel provisoria para ler as calorias das refei��es do teclado
		String descricao; //variavel provisoria para ler as descri��es das refei��es do teclado
		String[] semana = {"Domingo", "Segunda-Feira", "Terca-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "S�bado"}; //para printar o dia da semana ao listar as refei��es
		
		while(operacao != 8) { //MENU para escolher a a��o
			
			System.out.println("Qual operacao deseja realizar:"
								+ "\nInserir todas as refei��es da semana (1)"
								+ "\nInserir alguma refei��o espec�fica (2)"
								+ "\nSubstituir alguma refei��o espec�fica (3)"
								+ "\nExcluir alguma refei��o espec�fica (4)"
								+ "\nListar todas as refei��es da semana (5)"
								+ "\nListar as refei��es de algum dia (6)"
								+ "\nCalcular o valor total de calorias da semana (7)"
								+ "\nFechar o programa (8)\n");
			operacao = input.nextInt();
			
			//Inserir todas refei��es da semana, passando pelos dias e refei��es de cada dia, por meio de 2 "for"
			if(operacao == 1) {
				System.out.println("Digite a descri��o e a quantidade de calorias da refei��o:");
				for(int i=0; i<7; i++) {
					System.out.println(semana[i]+"\n");
					for(int j=0; j<6; j++) {
						input.nextLine();
						descricao = input.nextLine();
						caloria = input.nextDouble();
						cardapioSemana.inserirRefeicao(descricao, caloria, i, j);
					}
				}
			}
			
			//Inserir uma refei��o especifica de algum dia/hor�rio
			if(operacao == 2) {
				System.out.println("Qual o dia da semana (n�mero)?");
				int dia = (input.nextInt()-1);
				
				System.out.println("Qual a refei��o do dia (n�mero)?");
				int refeicao = (input.nextInt()-1);
				
				System.out.println("Digite a descri��o e a quantidade de calorias da refei��o:");
				input.nextLine();
				descricao = input.nextLine();
				caloria = input.nextDouble();
				cardapioSemana.inserirRefeicao(descricao, caloria, dia, refeicao);
			}
			
			//Substituir uma refei��o especifica de algum dia/hor�rio
			if(operacao == 3) {
				System.out.println("Qual o dia da semana (n�mero)?");
				int dia = (input.nextInt()-1);
				
				System.out.println("Qual a refei��o do dia (n�mero)?");
				int refeicao = (input.nextInt()-1);
				
				System.out.println("Digite a descri��o e a quantidade de calorias da refei��o:");
				input.nextLine();
				descricao = input.nextLine();
				caloria = input.nextDouble();
				cardapioSemana.inserirRefeicao(descricao, caloria, dia, refeicao);
			}
			
			//Excluir uma refei��o especifica de algum dia/hor�rio
			if(operacao == 4) {
				System.out.println("Qual o dia da semana (n�mero)?");
				int dia = (input.nextInt()-1);
				
				System.out.println("Qual a refei��o do dia (n�mero)?");
				int refeicao = (input.nextInt()-1);
				
				System.out.println("Refei��o exclu�da!");
				cardapioSemana.excluirRefeicao(dia, refeicao);
			}
			
			//Listas todas refei��es da semana por meio de 2 "for"
			if(operacao == 5) {
				System.out.println("Legenda:\n"
									+ "1- Caf� da Manh�\n"
									+ "2- Lanche da Manh�\n"
									+ "3- Almo�o\n"
									+ "4- Lanche da Tarde\n"
									+ "5- Jantar\n"
									+ "6- Ceia\n");
				
				for(int i=0; i<7; i++) {
					System.out.println(semana[i]+":\n");
					
					for(int j=0; j<6; j++) {
						if(cardapioSemana.getCardapio()[i][j] != null){
							System.out.println((j+1)+"- "+cardapioSemana.getCardapio()[i][j].getDescricao()+" - "+cardapioSemana.getCardapio()[i][j].getCalorias()+" cal");
						}
					}
					System.out.print("\n");
				}
			}
			
			//listar todas refei��es de algum dia, por meio de 1 "for"
			if(operacao == 6) {
				System.out.println("Legenda:\n"
						+ "1- Caf� da Manh�\n"
						+ "2- Lanche da Manh�\n"
						+ "3- Almo�o\n"
						+ "4- Lanche da Tarde\n"
						+ "5- Jantar\n"
						+ "6- Ceia\n");
				
				System.out.println("Qual o dia da semana (n�mero)?");
				int dia = (input.nextInt()-1);
				System.out.println(semana[dia]+"\n");
				
				for(int j=0; j<6; j++) {
					if(cardapioSemana.getCardapio()[dia][j] != null){
						System.out.println((j+1)+"- "+cardapioSemana.getCardapio()[dia][j].getDescricao()+" - "+cardapioSemana.getCardapio()[dia][j].getCalorias()+" cal");
					}
				}
				System.out.print("\n");
			}
			
			//exibe o valor de calorias de todas as refei��es somadas
			if(operacao == 7) {
				System.out.println("Total de calorias: "+cardapioSemana.calcularCalorias(7, 6)+" cal");
			}
		}
		input.close();
	}
}