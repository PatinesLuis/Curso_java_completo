package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Bom dia", "boa tarde", "boa noite"};
		
		//criar um arquivo
		String path = "D:\\\\projetos programação\\\\Curso_java_completo\\\\Trabalhando com arquivos\\\\exemplo1.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
