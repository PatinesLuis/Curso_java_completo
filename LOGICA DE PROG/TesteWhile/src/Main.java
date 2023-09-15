import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int tipo = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		
		Scanner ler = new Scanner(System.in);
		
		while(tipo != 4) {
			
			System.out.println("Digite o tipo de gasolina favorito");
			tipo = ler.nextInt();
			
			if(tipo == 1) {
				alcool +=1;
			}
			else if(tipo == 2){
				gasolina += 1;
				
			}else if(tipo == 3) {
				diesel += 1;
			}
		}
		
		System.out.println("Alcool: " + alcool);
		System.out.println("gasolina: " + gasolina);
		System.out.println("diesel: " + diesel);

	}

}
