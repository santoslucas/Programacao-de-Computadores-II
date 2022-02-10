package principal_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;
import java.util.ArrayList;

public class CaixaDeBrinquedo {
	private ArrayList< Forma > formas;
	
	public CaixaDeBrinquedo() {
		this.formas = new ArrayList <Forma>();
	}
	
	public ArrayList<Forma> getFormas() {
		return formas;
	}

	public void setFormas(ArrayList<Forma> formas) {
		this.formas = formas;
	}
	
	//Adiciona uma forma nova ao ArrayList
	public void addForma(Forma forma) {
		formas.add(forma);
	}
	
	/*
		Percorre todo o ArrayList usando um "for".
		Verifica se a forma e' Tridimensional ou Bidimensional.
		Depois verifica qual tipo de forma e': cubo, quadrado, circulo...
		Exibe uma mensagem no console informando o tipo da forma e sua area e volume
		Area e volume sao calculadas pelos metodos obterArea e obterVolume da classe Forma e Tridimensional
	*/
	public void calcularEspaco() {
		for(Forma objeto:formas) {
			
			if(objeto instanceof Tridimensional) {
				if(objeto instanceof Tetraedro) {
					System.out.print("\nSou um Tetraedro e minha área e volume são, respectivamente, ");
				}
				
				else {
					if(objeto instanceof Cubo) {
						System.out.print("\nSou um Cubo e minha área e volume são, respectivamente, ");
					}
					
					else {
						if(objeto instanceof Esfera) {
							System.out.print("\nSou uma Esfera e minha área e volume são, respectivamente, ");
						}
					}
				}
				
				System.out.print((objeto.obterArea()) + " e " + (((Tridimensional) objeto).obterVolume()));
			}
			
			else {
				if(objeto instanceof Bidimensional) {
					if(objeto instanceof Triangulo) {
						System.out.print("\nSou um Triângulo e minha área é ");
					}
					
					else {
						if(objeto instanceof Quadrado) {
							System.out.print("\nSou um Quadrado e minha área é ");
						}
						
						else {
							if(objeto instanceof Circulo) {
								System.out.print("\nSou um Círculo e minha área é ");
							}
						}
					}
					
					System.out.print((objeto.obterArea()));
				}
			}
		}
		System.out.print("\n");
	}
}
