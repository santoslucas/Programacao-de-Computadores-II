/*
* CABE�ALHO *

Alunos: Lucas Santos Rodrigues (20213001521)
		Marcela Caram (20213006528)
		Vin�cius Ferreira (20213005208)
		
Projeto: �rvore Geneal�gica
		
*/
import java.util.Scanner;
public class ArvoreGenealogica {
	public static void main(String[] args) {//Come�ar uma fun��o main
		Scanner input = new Scanner(System.in);
		
		int quantidadePessoas=0, PaiMae=0;//declarar vari�veis.
		
		System.out.println("Quantas pessoas voc� deseja adicionar?");
		quantidadePessoas = input.nextInt();//saber qunatas pessoas ser�o adicionadas a �rvore geneal�gica
		System.out.println(""); //saltar 1 linha
		
		Pessoa[] familia = new Pessoa [quantidadePessoas];
		
		for(int i=0; i<quantidadePessoas; i++) {//for para preencher todas as pessoas selecionadas
			
			System.out.println("Deseja inserir pai e m�e para pesssoa "+(i+1)+"?");//ver se a pessoa tem ou n�o tem pai.
			System.out.println("(0) Sim\n(1) N�o");
			PaiMae = input.nextInt();
			
			if(PaiMae == 0) {//caso a pessoa deseje digitar pai e m�e 
				System.out.println("Insira, respectivamente, o nome da pessoa "
									+(i+1)+", do pai e da m�e:");
				input.nextLine();
				familia[i] = new Pessoa(input.nextLine(), input.nextLine(), input.nextLine());//passar par�metros para a classe Pessoa para criar novos membros na �rvore
			}
			else {
				if(PaiMae == 1) {//caso a pessoa n�o deseje digitar pai e m�e.
					input.nextLine();
					System.out.println("Insira o nome da pessoa "+(i+1)+":");
					familia[i] = new Pessoa(input.nextLine());//passar par�metros para a classe Pessoa para criar novos membros na �rvore
				}
			}
		}
		
		for(int i=0; i<quantidadePessoas; i++) {//for para chamar todas os m�todos da classe pessoa, passando por todas as posi��es da string familia que foi criada
			for(int j=0; j<quantidadePessoas; j++) {//for para comparar 1 membros em cada fa�lia nas posi�~eos i e j.
					familia[i].compararPessoas(familia[j]);
					familia[i].verificarIrmas(familia[j]);
					familia[i].verificarAntecessor(familia[j]);
					familia[i].verificarAntecessor(familia[j].getPai());
					familia[i].verificarAntecessor(familia[j].getMae());
			}
			System.out.println("_______________/");
		}
		input.close();
	}
}