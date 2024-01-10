package principal;

import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Application {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do titular | numero da conta ");
		String nome = ler.next();
		Integer number = ler.nextInt();
		
		BusinessAccount ba = new BusinessAccount(number, nome);
		System.out.println("Olá " + ba.getHolder() + " Bem-vindo(a) - Conta: " + ba.getNumber());
		
		Double limit = 1500.50;
        Double balance = 0.0;

        BusinessAccount ba2 = new BusinessAccount(number, nome, balance, limit);
        System.out.println("seu limite de empréstimo é " + limit);

        System.out.println("Quanto de empréstimo deseja realizar?");
        Double loan = ler.nextDouble();
        ba2.loan(loan);

        System.out.println("Olá " + ba2.getHolder() + " Bem-vindo(a) - Conta: " + ba2.getNumber() + " Seu saldo é: " + ba2.getBalance());

        
        System.out.println("---- TESTE DE SOBREPOSIÇÃO --------");
        
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
        Account acc2 = new SavingsAccount(1002, "maria",1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());
       
    }
}