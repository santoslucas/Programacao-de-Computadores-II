package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;
import java.util.ArrayList;

public class ControlePagamento {
	public static final double SALARIO = 1192.40;
	public static final double HORA = 20.00;
	private ArrayList< Pagavel > pagamentos;
	
	public ControlePagamento() {
		pagamentos = new ArrayList< Pagavel >();
	}
	
	public ArrayList<Pagavel> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(ArrayList<Pagavel> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public static double getSALARIO() {
		return SALARIO;
	}

	public static double getHORA() {
		return HORA;
	}
	
	/*
	 *	Por meio de um "for" todo ArrayList<Pagavel> pagamentos é percorrido.
	 *	
	 *	É verficado se o objeto do ArrayList é uma conta ou um empregado.
	 *	Dessa forma, é registrado na primeira posição do array "despesas" a soma de todas as contas e
	 *	na segunda posição as somas dos salarios dos empregados.
	 *
	 *	O array "despesas" é retornado
	*/
	public double[] listarPagamentos(int diaPagto, int mesPagto) {
        double contas = 0.0;
        double salarios = 0.0;
        double[] despesas = new double[2];
        
        for(Pagavel item: pagamentos) {
            if(item instanceof Conta) {
                contas += item.getValorAPagar(diaPagto, mesPagto);
            }
            
            else {
            	if(item instanceof Empregado) {
            		salarios += item.getValorAPagar(diaPagto, mesPagto);
            	}
            }
        }
        despesas[0] =contas; 
        despesas[1] = salarios;
        
        return despesas;
    }
	
	/*
	 * 	Verifica o tipo de empregado e, dessa forma, cria e adiciona ao ArrayList.
	*/
	public void gravarEmpregado(String nome, String sobrenome, int numIdent, double complemento, int tipo) {
		if(tipo == 1) {
			pagamentos.add(new Terceirizado(nome, sobrenome, numIdent, complemento));
		}
		
		else {
			if(tipo == 2) {
				pagamentos.add(new Comissionado(nome, sobrenome, numIdent, complemento));
			}
			
			else {
				if(tipo == 3) {
					pagamentos.add(new Assalariado(nome, sobrenome, numIdent, complemento));
				}
				
				else {
					if(tipo == 4) {
						pagamentos.add(new AssalariadoComissionado(nome, sobrenome, numIdent, complemento));
					}
				}
			}
		}
	}
	
	/*
	 * 	Verifica o tipo de conta e, dessa forma, cria e adiciona ao ArrayList.
	*/
	public void gravarConta(int dia, int mes, double valor, int tipo) {
		if(tipo == 1) {
			pagamentos.add(new Titulo(dia, mes, valor));
		}
		
		else {
			if(tipo == 2) {
				pagamentos.add(new Concessionaria(dia, mes, valor));
			}
		}
	}
}
