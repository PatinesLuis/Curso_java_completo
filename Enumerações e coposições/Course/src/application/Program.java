package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o nome do departamento");
		String departamentName = ler.next();
		System.out.println("Entre com os dados do trabalhador:");
		System.out.println("Nome: ");
		String name = ler.next();
		System.out.println("level: ");
		String level = ler.next();
		System.out.println("salario base: ");
		double basesalary = ler.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), basesalary, new Departament(departamentName));
		
		System.out.println("Quantos contratos esse trabalhor terá: ");
		
		int n = ler.nextInt();
		
		for(int i=1; i<=n; i++ ) {
			System.out.println("Entre com o contrato: " + i );
			System.out.println("Date: ");
			Date contractDate = sdf.parse(ler.next());
			System.out.println("valor por hora");
			double valuePerHour = ler.nextDouble();
			System.out.println("Duração do contrato (hora)");
			int hours = ler.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("Entre com o mes e o ano para calcular o salario(MM/YYYY)");
		String monthYear = ler.next();
		int month = Integer.parseInt( monthYear.substring(0,2));
		int year = Integer.parseInt( monthYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("quando ganhou no: " + monthYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		ler.close();
	}

}
