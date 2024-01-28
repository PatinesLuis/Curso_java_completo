package entities;

public class PessoaJuridica extends pessoa{
	
	private int funcionarios;

	public PessoaJuridica(String nome, Double renda, int funcionarios) {
		super(nome, renda);
		this.funcionarios = funcionarios;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	@Override
	public Double imposto() {
		if(funcionarios > 10) {
			return getRenda() * 0.14;
		}else {
			return getRenda() * 0.16;
		}
	}
	

}
