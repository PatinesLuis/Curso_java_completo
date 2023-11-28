package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.funcionario;

public class Program {

	public static void main(String[] args) {
		
		List<funcionario> listaFun = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de registro");
		int qtd = ler.nextInt();
		int i =0;
		while(i <qtd) {
			System.out.println("Digite o ID");
			int id = ler.nextInt();
			
			System.out.println("Digite o nome");
			String nome = ler.next();
			
			System.out.println("Digite o salario");
			double salario = ler.nextDouble();
			listaFun.add(new funcionario(id,nome,salario));
			i++;
			
		}
		System.out.println(" ");
		
		for(funcionario x: listaFun) {
			System.out.println("id:" + x.getId());
			System.out.println("Nome:" + x.getName());
			System.out.println("Salario:" + x.getSalary());
			System.out.println("");
		}
		
	System.out.println("entre com o ID que vai aumentar o salario:");
	int id = ler.nextInt();
	Integer pos = posicaoId(listaFun, id);
	
	if(pos == null) {
		System.out.println("ESSE ID NÂO EXISTE");
	}else {
		System.out.println("entre com a %: ");
		double porc = ler.nextDouble();
		listaFun.get(pos).aumentosalario(porc);
	}
	
	
	for(funcionario x: listaFun) {
		int posição = 1;
		System.out.println("Posição #" + posição);
		System.out.println("id:" + x.getId());
		System.out.println("Nome:" + x.getName());
		System.out.println("Salario:" + x.getSalary());
		posição++;
	}

	}
	
	public static Integer posicaoId(List<funcionario> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
