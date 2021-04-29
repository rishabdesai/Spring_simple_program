package page;

public interface Passbook {

	int getAccNo();

	void setAccNo(int accNo);

	double getBalance();

	void setBalance(double balance);

	Person getAccHolderInfo();

	void setAccHolderInfo(Person accHolderInfo);

}