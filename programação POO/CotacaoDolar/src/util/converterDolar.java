package util;

public class converterDolar {
	public double valorDolar;
	public double pegarDolar;
	public double convercao;
	
	public double convercaoDolar() {
		
		double calc = valorDolar * pegarDolar;
		double iof = 6.0 * calc / 100;
		
		return calc + iof;
		
	}
}
