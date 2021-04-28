package page;

public class AccountImpl {
	private int accId;
	private String type;
	private double balance;
	private PersonImpl accHolder;

	public AccountImpl() {
		
	}

	public AccountImpl(int accId, String type, double balance, PersonImpl accHolder) {
		this.accId = accId;
		this.type = type;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public PersonImpl getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(PersonImpl accHolder) {
		this.accHolder = accHolder;
	}
	
	//business logic method
	public void deposit(double amount) {
			System.out.println("Deposit " + amount +" in account " + accId);
		this.balance += amount;
		System.out.println("Balance is  " + balance +" for account holder " + PersonImpl.class.getName());
	}
	
	public void withdraw(double amount) {
			System.out.println("Withdraw " + amount +" from account " + accId);
		this.balance -= amount;
		System.out.println("Balance is  " + balance +" for account holder " + PersonImpl.class.getName());
	}

	@Override
	public String toString() {
		return String.format("AccountImpl [accId=%s, type=%s, balance=%s, accHolder=%s]", accId, type, balance,
				accHolder);
	}

}
