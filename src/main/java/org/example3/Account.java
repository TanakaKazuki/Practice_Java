package org.example3;

public class Account {
    private String accountNo;
    private int balance;
    private AccountType accountType;

    //setter
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(String accountNo, AccountType accountType){
        setAccountNo(accountNo);
        setAccountType(accountType);
    }
}
