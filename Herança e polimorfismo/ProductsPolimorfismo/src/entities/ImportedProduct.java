package entities;

public class ImportedProduct extends Product {

		private  Double CustomsFee;
		
		public ImportedProduct(String nome, Double price, Double CustomsFee) {
		super(nome, price);
		this.CustomsFee = CustomsFee;
	}

		public Double getCustomsFee() {
			return CustomsFee;
		}

		public void setCustomsFee(Double customsFee) {
			CustomsFee = customsFee;
		}
		
		public Double totalPrice() {
			return super.getPrice() + CustomsFee;
		}
		
		
		@Override
		public String priceTag() {
			return getNome() + " $ " + totalPrice() + " (Custom fee: $ " + CustomsFee + ")";
		}
		
		
}
