/*
* CABEÇALHO *

Alunos: Lucas Santos Rodrigues (20213001521)
		Marcela Caram (20213006528)
		Sulamita Costa (20213001568)
		Vinícius Ferreira (20213005208)
		
		Prova Pratica 2
		
*/
package banco_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;
import java.util.Scanner;

public class TesteMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int menu = 0;
		Banco banco = new Banco();
		
		/*
		 * TESTE LUCIANA gera contas bancárias aleatórias para o teste das funções saque, depósito e verificar saldo.
		*/
		while(menu != 6) {
			System.out.println("O que deseja fazer?"
								+ "\n\t(1) Adicionar conta bancária."
								+ "\n\t(2) Verificar saldo."
								+ "\n\t(3) Efetuar um saque."
								+ "\n\t(4) Efetuar um depósito."
								+ "\n\t(5) TESTE LUCIANA."
								+ "\n\t(6) Sair.");
			
			menu = input.nextInt();
			
			if(menu == 1) {
				int tipo = 0;
				
				System.out.println("Qual tipo de conta deseja adicionar?"
						+ "\n\t(1) Conta poupança."
						+ "\n\t(2) Conta corrente simples."
						+ "\n\t(3) Conta corrente especial.");
				
				tipo = input.nextInt();
				
				if(tipo == 1) {
					String nome;
					int numConta;
					double saldo;
					
					System.out.println("Informe o nome, número e saldo da conta, respectivamente:");
					input.nextLine();
					nome = input.nextLine();
					numConta = input.nextInt();
					saldo = input.nextDouble();
					
					banco.addConta(new ContaPoupanca(nome, numConta, saldo));
				}
				
				else {
					if(tipo == 2) {
						String nome;
						int numConta;
						double saldo;
						
						System.out.println("Informe o nome, número e saldo da conta, respectivamente:");
						input.nextLine();
						nome = input.nextLine();
						numConta = input.nextInt();
						saldo = input.nextDouble();
						
						banco.addConta(new ContaCorrenteSimples(nome, numConta, saldo));
					}
					
					else {
						if(tipo == 3) {
							String nome;
							int numConta;
							double saldo, limite;
							
							System.out.println("Informe o nome, número, saldo e limite da conta, respectivamente:");
							input.nextLine();
							nome = input.nextLine();
							numConta = input.nextInt();
							saldo = input.nextDouble();
							limite = input.nextDouble();
							
							banco.addConta(new ContaCorrenteEspecial(nome, numConta, saldo, limite));
						}
					}
				}
			}
			
			else {
				if(menu == 2) {
					int tipo = 0;
					
					System.out.println("Deseja saber:"
									+ "\n\t(1) Saldo geral das contas do banco."
									+ "\n\t(2) Saldo de uma conta específica.");
					
					tipo = input.nextInt();
					
					if(tipo == 1) {
						System.out.println("Saldo geral: R$ " + banco.somarSaldos());
					}
					
					else {
						if(tipo == 2) {
							int numConta;
							
							System.out.println("Qual o número da conta?");
							numConta = input.nextInt();
							
							for(ContaBancaria objeto: banco.getContas()) {
								if(numConta == objeto.getNumConta()) {
									System.out.println("Seja bem vindo, " + objeto.getNome() + "."
											+ "\n\tSeu saldo é de R$ " + objeto.getSaldo());
									
								}
							}
						}
					}
				}
				
				else {
					if(menu == 3) {
						int numConta;
						
						System.out.println("Qual o número da conta?");
						numConta = input.nextInt();
						
						for(ContaBancaria objeto: banco.getContas()) {
							if(numConta == objeto.getNumConta()) {
								double saque;
								
								System.out.println("Seja bem vindo, " + objeto.getNome() + "."
												+ "\nQual o valor do saque?");
								
								saque = input.nextDouble();
								
								if(objeto.sacar(saque)) {
									System.out.println("Saque efetuado.");
									System.out.println("Novo saldo: R$ " + objeto.getSaldo());
								}
								
								else {
									System.out.println("Erro: saldo insuficiente."
													+ "\nSaldo atual: R$ " + objeto.getSaldo());
									
									if(objeto instanceof ContaCorrenteEspecial) {
										System.out.println("Limite de crédito atual: R$ " + ((ContaCorrenteEspecial)objeto).getLimite());
									}
								}
							}
						}
					}
					
					else {
						if(menu == 4) {
							int numConta;
							
							System.out.println("Qual o número da conta?");
							numConta = input.nextInt();
							
							for(ContaBancaria objeto: banco.getContas()) {
								if(numConta == objeto.getNumConta()) {
									double deposito;
									
									System.out.println("Seja bem vindo, " + objeto.getNome() + "."
													+ "\nQual o valor do depósito?");
									
									deposito = input.nextDouble();
									
									objeto.depositar(deposito);
									
									System.out.println("Novo saldo: R$ " + objeto.getSaldo());
								}
							}
						}
						
						else {
							
							//CONTAS PARA TESTE LUCIANA
							if(menu == 5) {
								banco.addConta(new ContaPoupanca("Lucas Santos", 1, 1200));
								banco.addConta(new ContaCorrenteSimples("Sulamita Costa", 2, 34000));
								banco.addConta(new ContaCorrenteEspecial("Vinicius Pinheiro", 3, 100, 1500));
								banco.addConta(new ContaCorrenteEspecial("Marcela Caram", 4, 0, 2000));
							}
						}
					}
				}
			}
			System.out.print("\n");
		}
		
		input.close();
		System.out.println("Já vai? :(\nAté mais...");
	}
}
