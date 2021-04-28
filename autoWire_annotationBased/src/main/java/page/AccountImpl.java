package page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AccountImpl {
	private int accId;
	private String type;
	private double balance;
	@Autowired  //field based autowired
	@Qualifier("p1") // when autowired has multiple candidate, use Qualifier
	private PersonImpl accHolder; //account HAS-A AccountHolder (i.e. person)
	@Autowired
	private Logger logger = null; //Account HAS-A logger

	public AccountImpl() {
	}

//	public AccountImpl(Logger logger) {
//		this.logger = logger;
//	}

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
	
	
	//getter and setter for Logger
	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	
	//business methods
	public void deposit(double amount) {
		if(logger != null)
			logger.log("Deposit " + amount +" in account " + accId);
		this.balance += amount;
		System.out.println("New Balance amount : "+balance);

	}
	
	public void withdraw(double amount) {
		if(logger != null)
			logger.log("Withdraw " + amount +" from account " + accId);
		this.balance -= amount;
			System.out.println("New Balance amount : "+balance );
	}

	@Override
	public String toString() {
		return String.format("AccountImpl [accId=%s, type=%s, balance=%s, accHolder=%s]", accId, type, balance,
				accHolder);
	}

}
