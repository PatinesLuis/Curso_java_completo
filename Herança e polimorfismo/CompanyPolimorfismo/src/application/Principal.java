package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Principal {

	public static void main (String [] args) {
		
		Scanner ler = new Scanner(System.in);
		
		List<Employee> e = new ArrayList<>();
		
		System.out.println("Digite quantos funcionarios");
		int qtd = ler.nextInt();
		
		int c = 1;
		while(c <= qtd) {
			
			System.out.println("Funcionario #" + c);
			System.out.println("O funcionario é tercerizado? ");
			String rest = ler.next();
			
			switch (rest) {
			case "n":
				System.out.println("nome");
				String name = ler.next();
				
				System.out.println("horas");
				Integer hours = ler.nextInt();
				
				System.out.println("valor por hora");
				Double valueHours = ler.nextDouble();
				
				e.add(new Employee(name, hours, valueHours));
				break;
				
			case "y":
				System.out.println("nome");
				 name = ler.next();
				
				System.out.println("horas");
				 hours = ler.nextInt();
				
				System.out.println("valor por hora");
				 valueHours = ler.nextDouble();
				 
				 System.out.println("Custo adicional");
				 Double adCharge = ler.nextDouble();
				 
				 e.add(new OutsourcedEmployee(name, hours, valueHours, adCharge));
				break;
			default:
				break;
			}
			c++;
		}
		
		for(Employee emp : e) {
			System.out.println(emp.getName() + " - $ " + emp.payment());
		}
	}
	
}
