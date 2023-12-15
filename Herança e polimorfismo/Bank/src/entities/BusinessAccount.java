package entities;

public class BusinessAccount extends Account {

		private Double loanLimite;
		
		public BusinessAccount() {
			super();
		}
		
		
		public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
			super(number, holder, balance);
			this.loanLimite = loanLimite;
		}
		
		
		public BusinessAccount(Integer number, String holder) {
			super(number, holder);
		}


		public void loan(double amount) {
		    if (loanLimite != null && amount >= loanLimite) {
		        System.out.println("Passou do limite");
		    } else {
		        deposit(amount);
		    }
		}

		public Double getLoanLimite() {
			return loanLimite;
		}

		public void setLoanLimite(Double loanLimite) {
			this.loanLimite = loanLimite;
		}
		
		
}
