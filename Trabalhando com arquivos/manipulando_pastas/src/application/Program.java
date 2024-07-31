package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma pasta: ");
		String caminho = ler.nextLine();
		
		//guarda o diretório
		File path = new File(caminho);
		
		//array só com as pastas do diretório
		File[] pastas = path.listFiles(File::isDirectory);
		
		System.out.println("Pastas");
		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		
		
		//array só com os arquivos do diretório
		File[] arquivos = path.listFiles(File::isFile);
		
		System.out.println("arquivos");
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
	}

}
