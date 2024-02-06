package principal;

import java.util.Scanner;

import entities.Account;
import entities.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		
		System.out.println("Number:");
		Integer number = ler.nextInt();
		
		System.out.println("Holder: ");
		String holder = ler.next();
		
		System.out.println("Inicial balance: ");
		Double balance = ler.nextDouble();
		
		System.out.println("Withdraw");
		Double limit = ler.nextDouble();
		
		Account acc = new Account(number, holder, balance, limit);
		
		System.out.println("Enter amount for withdraw");
		Double amount = ler.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.println(acc);
		}catch(DomainException e) {
			System.out.println("withdraw error: " + e.getMessage());
		}
			
		
		
		
		
	}

}
