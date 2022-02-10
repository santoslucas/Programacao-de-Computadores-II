/*
* CABEÇALHO *

Alunos: Lucas Santos Rodrigues (20213001521)
		Marcela Caram (20213006528)
		Sulamita Costa (20213001568)
		Vinícius Ferreira (20213005208)
		
		Atividade 5 - Formas
		
*/
package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int menu = 0;
		CaixaDeBrinquedo brinquedos = new CaixaDeBrinquedo();
		
		/*O menu roda enquanto o usuario nao solicita sair do mesmo. Ele pergunta o que o usuario deseja,
		sendo possivel adicionar uma forma (bidimensional ou tridimensional), processar formas (exibe o que
		foi adicionado no arraylist) e testar classes.
		OBSERVACAO: A opacao testar classes serve para que o funcionamento do programa possa ser realizado sem
		a necessidade de adicionar cada forma manualmente. Ou seja, serve para que voce, Luciana, teste. */

		while(menu != 4) {
			System.out.println("O que deseja fazer?"
								+ "\n\t(1) Adicionar brinquedo (forma)."
								+ "\n\t(2) Processar formas."
								+ "\n\t(3) TESTAR CLASSES (LUCIANA)"
								+ "\n\t(4) Sair.");
			
			menu = input.nextInt();
			
			/*Se a opcao selecionada foi 1, adicionar brinquedo, o programa pergunta qual tipo o usuario deseja,
			sendo bidimensional ou tridimensional.
			Em caso de Bidimensional, o programa pergunta qual das tres formas o usuario deseja adicional, sendo
			estas triangulo, quadrado ou circulo e, para cada um desses, pergunta as informacoes necessarias para
			calcular sua area. Entao, um metodo da classe CaixaDeBrinquedo (addForma) e' chamado, criando a forma solicitada.
			Em caso de tridimensional, o programa faz um procedimento analogo ao da Bidimensional, perguntando a forma e, em
			seguida, pedindo as dimensoes necessarias para calcular a area da superficie e o volume da forma solicitada. Isso,
			usando o mesmo metodo da classe CaixaDeBrinquedo (addForma).
			*/
			if(menu == 1) {
				int tipo = 0;
				
				System.out.println("Deseja adicionar um brinquedo:"
								+"\n\t(1) Bidimensional."
								+ "\n\t(2) Tridimensional.");
				
				tipo = input.nextInt();
				
				if(tipo == 1) {
					int forma = 0;
					
					System.out.println("Qual forma deseja adicionar?"
									+ "\n\t(1) Triângulo."
									+ "\n\t(2) Quadrado."
									+ "\n\t(3) Círculo.");
					
					forma = input.nextInt();
					
					if(forma == 1) {
						double base=0, altura=0;
						System.out.println("Digite a base e a altura do Triângulo:");
						
						base = input.nextInt();
						altura = input.nextInt();
						
						brinquedos.addForma(new Triangulo(base, altura));
					}
					
					else {
						if(forma == 2) {
							double lado = 0;
							System.out.println("Digite o lado do Quadrado:");
							
							lado = input.nextInt();
							brinquedos.addForma(new Quadrado(lado));
						}
						
						else {
							if(forma == 3) {
								double raio = 0;
								System.out.println("Digite o raio do Círculo:");
								
								raio = input.nextInt();
								brinquedos.addForma(new Circulo(raio));
							}
						}
					}
				}
				
				else {
					if(tipo == 2) {
						int forma = 0;
						
						System.out.println("Qual forma deseja adicionar?"
										+ "\n\t(1) Tetraedro."
										+ "\n\t(2) Cubo."
										+ "\n\t(3) Esfera.");
						
						forma = input.nextInt();
						
						if(forma == 1) {
							double aresta = 0;
							System.out.println("Digite a aresta do Tetraedro:");
							
							aresta = input.nextInt();
							brinquedos.addForma(new Tetraedro(aresta));
						}
						
						else {
							if(forma == 2) {
								double lado = 0;
								System.out.println("Digite o lado do Cubo:");
								
								lado = input.nextInt();
								brinquedos.addForma(new Cubo(lado));
							}
							
							else {
								if(forma == 3) {
									double raio = 0;
									System.out.println("Digite o raio da Esfera:");
									
									raio = input.nextInt();
									brinquedos.addForma(new Esfera(raio));

								}
							}
						}
					}

				}
				System.out.print("\n");
			}
			
			// Processa todas as formas salvas no ArrayList pelo metodo calcularEspaco da classe CaixaDeBrinquedos
			else {
				if(menu == 2) {
					brinquedos.calcularEspaco();
					System.out.print("\n");
				}
				
				// Cria 1 forma de cada tipo para testar o funcionamento das classes
				else{
					if(menu == 3){
						brinquedos.addForma(new Triangulo(2, 3));
						brinquedos.addForma(new Quadrado(2));
						brinquedos.addForma(new Circulo(5));
						brinquedos.addForma(new Tetraedro(4));
						brinquedos.addForma(new Cubo(2));
						brinquedos.addForma(new Esfera(5));
					}
				}
			}
		}
		System.out.println("Já vai? :(\nAté mais...");
		
		input.close();		
	}
}
