package entities;

public class contaBancaria {
	
	private int number;
	private String nome;
	private double valor;
	
	public contaBancaria(int number, String nome, double valor) {
		this.number = number;
		this.nome = nome;
		this.valor = valor;
	}
	
	public contaBancaria(int number, String nome) {
		this.number = number;
		this.nome = nome;
	}

	public int getNumber() {
		return number;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	
	public void deposito (double deposito) {
		valor += deposito;
	}
	
	public void sacar (double saque) {
		valor -= saque + 5;
	}

	@Override
	public String toString() {
		return "Conta: " + number +
				", Nome: " + nome +
				", Valor: R$ " + String.format("%.2f", valor);
	}

	
}
