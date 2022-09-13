package day4.msbank.domain;

import day4.msbank.inter.Personlnter;

public class BankCustomer extends BankCard implements Personlnter {
    private String username; //姓名
    private String address; //家庭住址
    private String ID; //身份证号
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    //存款业务
    @Override
    public void saveMoney(double money) {
        if (money > 0){
            this.balance = this.balance + money;
        }else {
            System.out.println("输入非法");
        }
    }
    //取款业务
    @Override
    public void getMoney(double money) {
        if (money > 0){
            this.balance = this.balance - money;
        }else {
            System.out.println("余额不足");
        }
    }
    //查询余额业务
    @Override
    public double queryMoney() {
        return this.balance;
    }
    @Override
    public void getOhterInfo() {
    }
    @Override
    public void getYearIncome() {
    }
    @Override
    public String toString() {
        return "BankCustomer{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", ID='" + ID + '\'' +
                ", balance=" + balance +
                '}';
    }
}