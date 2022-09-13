package day4.msbank.inter;

import day4.msbank.domain.BankCustomer;

public interface BankServiceInter {
    void saveMoney(BankCustomer bankCustomer, double money);
    void getMoney(BankCustomer bankCustomer,double money);
    double queryMoney(BankCustomer bankCustomer);
    BankCustomer initBankInfo();
    void transfer(BankCustomer bankCustomer, BankCustomer bankCustomer1, double money);
}
