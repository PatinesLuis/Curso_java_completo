package entities;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double tax;
	
	public double salarioLiquido() {
		return salario - tax;
	}
	
	public void incrementSalario(double porc) {
		double calc = porc * salario / 100;
		
		salario += calc;
	}
	
}
