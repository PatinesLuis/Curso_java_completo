package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Joao");
		list.add("beto");
		list.add("leandro");
		list.add("luis");
		list.add(2, "marcos");
		
		System.out.println(list.size()); //quantos dados tem na lista/ tamanho da lista
		list.remove("beto");
		for(String x: list) { // percorrer e visualizar a lista
			System.out.println(x);
		}
		
		System.out.println("-=----=--=-");
							
		list.removeIf(x -> x.charAt(0) == 'm');
						//(predicado)
		for(String x: list) { // percorrer e visualizar a lista
			System.out.println(x);
		}
		
			System.out.println("-=----=--=- Index of luis " + list.indexOf("luis")); //encontrar a posição de um elemento.
		
			System.out.println("-=----=--=-");
			System.out.println("Filtro para imprimir apenas a letra que eu desejo");
			
			List<String> result = list.stream().filter(x -> x.charAt(0) == 'l').collect(Collectors.toList());
			
			for(String x: result) { // percorrer e visualizar a lista
				System.out.println(x);
			}
			
			System.out.println("-=----=--=- encontrar o nome cujo a letra 'l'");
			String name = list.stream().filter(x -> x.charAt(0) == 'l').findFirst().orElse(null);
			// o findfirst vai pegar o primeiro elemento da stream que atende o predicado
			System.out.println(name);
	}															
	
}
