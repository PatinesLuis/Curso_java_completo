package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.PessoaJuridica;
import entities.pessoa;
import entities.pessoaFisica;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		  List<pessoa> lista = new ArrayList<>();

	        System.out.println("Entre com o numero de pessoas com imposto");
	        int n = ler.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.println("Digite a pessoa com imposto: " + (i + 1));
	            System.out.println("Pessoa física ou jurídica?");
	            char type = ler.next().charAt(0);
	            System.out.println("Nome:");
	            String nome = ler.next();

	            System.out.println("Renda anual:");
	            double renda = ler.nextDouble();

	            if (type == 'f') {
	                System.out.println("Quanto gasta com saúde?");
	                double saude = ler.nextDouble();

	                // Adiciona à lista do tipo pessoa usando polimorfismo
	                lista.add(new pessoaFisica(nome, renda, saude));
	            }else {
	            	System.out.println("Qual o numero de funcionarios");
	            	int funcionarios = ler.nextInt();
	            	lista.add(new PessoaJuridica(nome, renda, funcionarios));
	            }
		}
	        double sum = 0.0;
	        System.out.println();
	        for (pessoa tp : lista) {
				double tax = tp.imposto();
				System.out.println(tp.getNome() + ": $ " + String.format("%.2f", tax));
				sum += tax;
			}
	        
	        System.out.println();
	        System.out.println("Total de impostos: " + sum);
	}

}
