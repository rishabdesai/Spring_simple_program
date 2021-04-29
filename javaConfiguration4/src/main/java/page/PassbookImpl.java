package page;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PassbookImpl implements Passbook {
	@Value("#{accountImpl.accId}")   //SPEL syntex
	private int accNo;
	@Value("#{accountImpl.getBalance()}")
	private double balance;
	//@Autowired
	@Value("#{personImpl}")
	private Person accHolderInfo;
	
	public PassbookImpl() {
	}
	


	@Override
	public int getAccNo() {
		return accNo;
	}

	@Override
	public void setAccNo(int accNo) {
		this.accNo = accNo;
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
	public Person getAccHolderInfo() {
		return accHolderInfo;
	}

	@Override
	public void setAccHolderInfo(Person accHolderInfo) {
		this.accHolderInfo = accHolderInfo;
	}

	@Override
	public String toString() {
		return String.format("PassbookImpl [accNo=%s, balance=%s, accHolderInfo=%s]", accNo, balance, accHolderInfo);
	}

}
