import java.util.Scanner;
public class TesteRelogio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int formatoHoras, hora, minuto, formato12h=0;
		
		System.out.println("Deseja exibir o formato de 24h(1) ou 12h(2) ?");
		formatoHoras = input.nextInt();
		System.out.println("Deseja come�ar o rel�gio as que horas?");
		hora = input.nextInt();
		System.out.println("E minuto?");
		minuto = input.nextInt();
		
		Relogio rolex = new Relogio(hora, minuto);
		
		if(formatoHoras == 1) {
			rolex.setFormato24h(true);
			//String s = "0"+Integer.toString(hora);
		}
		else {
			rolex.setFormato24h(false);
		}
		
		for(int i=rolex.getHora().getValor(); i<rolex.getHora().getLimite();) {
			rolex.ticTac();
			
			if(rolex.getMinuto().getValor() == 0) {
				i++;
			}
			if(rolex.isFormato24h() == false && rolex.getHora().getValor() == 13 && rolex.getMinuto().getValor() == 0) {
				formato12h = 12;
			}
			
			if((rolex.getHora().getValor()-formato12h) < 10) {
				if(rolex.getMinuto().getValor() < 10) {
					System.out.print("\n0"+((rolex.getHora().getValor())-formato12h)+":0"+(rolex.getMinuto().getValor()));
				}
				else {
					System.out.print("\n0"+((rolex.getHora().getValor())-formato12h)+":"+(rolex.getMinuto().getValor()));
				}
			}
			
			else {
				if(rolex.getMinuto().getValor() < 10) {
					System.out.print("\n"+((rolex.getHora().getValor())-formato12h)+":0"+(rolex.getMinuto().getValor()));
				}
				else {
					System.out.print("\n"+((rolex.getHora().getValor())-formato12h)+":"+(rolex.getMinuto().getValor()));
				}
			}
			
			if(rolex.isFormato24h() == false && (rolex.getHora().getValor())<12) {
				System.out.print(" am");
			}
			else {
				if(rolex.isFormato24h() == false && (rolex.getHora().getValor())>=12) {
					System.out.print(" pm");
					if(rolex.getHora().getValor() == 23 && rolex.getMinuto().getValor() == 59) {
						formato12h = 0;
					}
				}
			}
		}
		input.close();
	}
}
