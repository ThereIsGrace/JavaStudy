package ch06.test;

public class Account {
	private String accountNum;
	private String userName;
	private int deposit;
	
	
	@Override 
	public String toString() {
		return String.format("%s\t%s\t%s", accountNum, userName, deposit);
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Account(String accountNum, String userName, int deposit) {
		super();
		this.accountNum = accountNum;
		this.userName = userName;
		this.deposit = deposit;
	}



	public String getAccountNum() {
		return accountNum;
	}



	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public int getDeposit() {
		return deposit;
	}



	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
}
