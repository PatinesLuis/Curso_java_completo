package entities;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;
	
	public void withdraw(double amount) {
        if (balance != null) {
            balance -= amount + 5.0;
        } else {
            System.out.println("Saldo não inicializado. Realize um depósito primeiro.");
        }
    }

    public void deposit(double amount) {
        if (balance != null) {
            balance += amount;
        } else {
            System.out.println("Saldo não inicializado. Realize um depósito primeiro.");
        }
    }
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	
	
}
