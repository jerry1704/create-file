package com.javatechie.report.db;

import java.util.List;

import com.gerardo.domain.AccountRetrieveExcel;

public class Detalle {
  
  private AccountRetrieveExcel accountOne;
  
  private AccountRetrieveExcel accountTwo;

  private AccountRetrieveExcel accountThree;
  
  private List<AccountRetrieveExcel> accountList;
 
  
  public AccountRetrieveExcel getAccountOne() {
    return accountOne;
  }

  public void setAccountOne(AccountRetrieveExcel accountOne) {
    this.accountOne = accountOne;
  }

  public AccountRetrieveExcel getAccountTwo() {
    return accountTwo;
  }

  public void setAccountTwo(AccountRetrieveExcel accountTwo) {
    this.accountTwo = accountTwo;
  }

  public AccountRetrieveExcel getAccountThree() {
    return accountThree;
  }

  public void setAccountThree(AccountRetrieveExcel accountThree) {
    this.accountThree = accountThree;
  }

  public List<AccountRetrieveExcel> getAccountList() {
    return accountList;
  }

  public void setAccountList(List<AccountRetrieveExcel> accountList) {
    this.accountList = accountList;
  }
  
  
  
}