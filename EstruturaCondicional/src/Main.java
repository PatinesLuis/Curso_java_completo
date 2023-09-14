import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int horaInicial, horaFinal;
		int duracao = 0;
		
		System.out.println("Qual a hora inicial?");
		horaInicial = ler.nextInt();
		System.out.println("Qual a hora final?");
		horaFinal = ler.nextInt();
		
		if(horaFinal < horaInicial) {
			duracao =   horaFinal - (24 - horaInicial);	
		}else {
			duracao =  horaFinal - horaInicial;	
		}
		System.out.println("O jogo durou " + duracao + " HORAS");
		System.out.println("------------");
		
		System.out.println("CODIGO | ESPECIFICAÇÃO | PREÇO");
		System.out.println("  1    |Cachorro-quente| R$ 4.00");
		System.out.println("  2    | X-salada      | R$ 4.50");
		System.out.println("  3    | X-Bacom       | R$ 2.00");
		System.out.println("  4    | Refrigerante  | R$ 1.50");
		
		int codigo = 0;
		int qtd = 0;
		double preco=0;
		System.out.println("Digite um código!");
		codigo = ler.nextInt();
		System.out.println("Digite a quantidade !");
		qtd = ler.nextInt();
		
		if(codigo ==1) {
			preco = 4.00 * qtd;
		}
		else if (codigo ==2) {
			preco = 4.50 * qtd;
		}
		else if (codigo ==3) {
			preco = 2.00 * qtd;
		}
		else if(codigo ==4) {
			preco = 1.50 * qtd;
		}
		
		System.out.println("O preço a pagar é de: R$ " + preco);
		
		
		ler.close();
	}

}
