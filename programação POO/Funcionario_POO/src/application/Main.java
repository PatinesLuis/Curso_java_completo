package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner (System.in);
		
		Funcionario f1 = new Funcionario();
		
		System.out.println("Nome:");
		f1.nome = ler.next();
		
		System.out.println("Salario:");
		f1.salario = ler.nextDouble();
		
		System.out.println("Taxação");
		f1.tax = ler.nextDouble();
		
		System.out.println("Funcionario: " +f1.nome + ", R$: " + f1.salarioLiquido());
		
		System.out.println("Qual a porcentagem de aumento deseja aumentar?");
		
		double porc = ler.nextDouble();
		
		f1.incrementSalario(porc);
		
		System.out.println("Upgrade de salario de: " + f1.nome + ", R$: " + f1.salarioLiquido());

	}

}
