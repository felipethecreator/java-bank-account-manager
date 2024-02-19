package entities;

public class Account {

	private int accountNumber;
	private String holderName;
	private double balance;
	
	
	// ACC NUMBER NÃO PODE SER ALTERADO - GETTER
	// NOME PODE MUDAR - GETTER E SETTER
	// BALANCE PODE SER ALTERADO COM O TEMPO - GETTER E SETTER
	
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	// CONSTRUTOR SEM O BALANCE (O CLIENTE PODE NÃO TER SALDO INICIAL)
	
	public Account(int accountNumber, String holderName, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		deposit(initialDeposit);
	}

	// CONSTRUTOR **COM** BALANCE (O CLIENTE SELECIONARÁ A OPÇÃO DE INSERIR SALDO INCIAL)
	
	public Account(int accountNumber, String holderName) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ holderName
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
}
}
