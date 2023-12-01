package program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Application {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.parse("2022-07-03");
		LocalDateTime d2 = LocalDateTime.parse("2022-07-03T01:30:26");
		Instant d3 = Instant.parse("2022-07-03T01:30:26Z");
		
		LocalDate subtrairDias = d1.minusDays(7);
		System.out.println(subtrairDias);
		
		LocalDateTime subtrairDiasTime = d2.plusYears(2);
		System.out.println(subtrairDiasTime);

	}

}
