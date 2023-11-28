package application;

public class Program {

	public static void main(String[] args) {
		
		String [] vect = new String[] {"Mario", "luis", "Maria", "bobs"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		//para cada objeto 'nomes' contido em vect, faça
		//foreach
		System.out.println("-------------");
		for(String nomes: vect) {
			System.out.println(nomes);
		}
	}

}
