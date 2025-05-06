package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
    	
    }
    public Account(String accountNo) {
    	this.accountNo = accountNo;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
    }
   
  
    //필요한 메소드 작성
    public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
    
    //메소드 일반
    public void deposit(int money) {
    	balance = balance + money;
    }
	public void withdraw(int money) {
		if(balance >= money) {
			balance = balance - money;
		}else {
			System.out.println("잔액이 부족합니다.");
		}
    }
    public void showBalance() {
    	System.out.println(balance);
    }
    
}
