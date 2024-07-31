package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("D:\\projetos programação\\Curso_java_completo\\Trabalhando com arquivos\\exemplo.txt");
		Scanner ler = null;
		try {
			ler = new Scanner(file);
			while (ler.hasNextLine()) { //verificar se existe uma proxima linha no arquivo
				System.out.println(ler.nextLine());
			}
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
