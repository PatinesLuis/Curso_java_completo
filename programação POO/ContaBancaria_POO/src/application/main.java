package application;

import java.util.Locale;
import java.util.Scanner;

import entities.contaBancaria;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner(System.in);
		contaBancaria conta;

		System.out.println("entre com o numero da conta");
		int numero = ler.nextInt();
		
		System.out.println("nome da conta");
		String nome = ler.next();
		
		System.out.println("Possui deposito inicial?");
		char resposta = ler.next().charAt(0);
		
		if(resposta == 's') {
			System.out.println("Entre com o deposito inicial");
			double depositoInicial = ler.nextDouble();
			conta = new contaBancaria(numero, nome, depositoInicial);
		}
		else{
			conta = new contaBancaria(numero, nome);
		}
		
		System.out.println();
		System.out.println("CONTA BANCARIA");
		System.out.println(conta);
		
		
		
		
		System.out.println("Entre com o deposito novo: ");
		double novoDeposito = ler.nextDouble();
		conta.deposito(novoDeposito);
		System.out.println("Upload de deposito");
		System.out.println(conta);
		
		
		System.out.println("Qual valor deseja sacar: ");
		double saque = ler.nextDouble();
		conta.sacar(saque);
		
		System.out.println("Upload de deposito");
		System.out.println(conta);
		
		
		ler.close();
	}

}
