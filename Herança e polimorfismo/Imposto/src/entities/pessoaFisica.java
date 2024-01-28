package entities;

public class pessoaFisica extends pessoa {

	private Double gastosSaude;

	public pessoaFisica(String nome, Double renda, Double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double imposto() {
		Double impostoRenda = 0.0;
		Double impostoSaude = 0.0;
		
		if(getRenda() < 20000) {
			impostoRenda =  (15 * getRenda()) / 100; 
		}else if(getRenda() >= 20000) {
			impostoRenda =  (20 * getRenda()) / 100;
		}
		
		if(gastosSaude > 0) {
			impostoSaude = (50 * gastosSaude) / 100;
		}	
		Double result = impostoRenda + impostoSaude;
		
		return result;
	}
	

	
	
}
