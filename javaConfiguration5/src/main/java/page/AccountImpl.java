package page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountImpl implements Account {
	private int accId;
	private String type;
	private double balance;
	@Autowired
	private Person accHolder;

	public AccountImpl() {
	}

	public AccountImpl(int accId, String type, double balance, Person accHolder) {
		this.accId = accId;
		this.type = type;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	

	@Override
	public int getAccId() {
		return accId;
	}

	@Override
	public void setAccId(int accId) {
		this.accId = accId;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public Person getAccHolder() {
		return accHolder;
	}

	@Override
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	@Override
	public void withdraw(double amount) {
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return String.format("AccountImpl [accId=%s, type=%s, balance=%s, accHolder=%s]", accId, type, balance,
				accHolder);
	}

}
