package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		//instanciar a data atual
		LocalDate d01 = LocalDate.now();
		
		//data e hora atual
		LocalDateTime d02 = LocalDateTime.now();
		
		//data e hora atual de londres padrão iso-8
		Instant d03 = Instant.now();
		
		//formatação padrão do brasil
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d04 = LocalDate.parse("22/12/2020", fm);

		System.out.println("data atual " + d01);
		System.out.println("data e hora atual " + d02);
		System.out.println("data e hora de londres " + d03);
		System.out.println("data inserida do brasil mas mostrando data iso " + d04);
		
		System.out.println("--textos de formas alternativas--");
		System.out.println("data formatada no brasil: " + d01.format(fm));

	}

}
