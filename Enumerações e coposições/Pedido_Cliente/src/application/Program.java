package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.product;
import enuns.orderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner ler = new Scanner(System.in);
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Entre com o cliente");
		System.out.println("Qual o nome: ");
		String nome = ler.next();
		System.out.println("Qual o Email: ");
		String email = ler.next();
		System.out.println("Qual sua data de nascimento: ");
		Date dataNascimento = sdf.parse(ler.next());
		Client cli = new Client(nome,email,dataNascimento);
		
		System.out.println("Entre com os dados do pedido");
		System.out.println("Status: ");
		
		orderStatus statusString = orderStatus.valueOf(ler.next());
		Order order = new Order(new Date(), statusString, cli);
		System.out.println("Quantos o pedido vai ter: ");
		int n = ler.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Entre com o pedido: " + i);
			System.out.println("nome do produto: ");
			String nomeProduto = ler.next();
			System.out.println("Preço : ");
			Double preco = ler.nextDouble();
			System.out.println("Quantidade: ");
			int qtd = ler.nextInt();
			
			product product = new product(nomeProduto, preco);
			OrderItem it = new OrderItem(qtd,preco,product);
			
			order.addItem(it);
		}
		

		System.out.println(order);
	}

}
