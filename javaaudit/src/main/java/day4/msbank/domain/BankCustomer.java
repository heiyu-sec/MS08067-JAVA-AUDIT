package day4.msbank.domain;

import day4.msbank.inter.Personlnter;

import java.text.SimpleDateFormat;
import java.util.Date;

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
        //Heiyu修改了此部分从而解决了第二个逻辑漏洞
        if(money > 0){  }
        else{
            System.out.println("输入非法");
            return;
        }
        //Heiyu增加了此部分从而解决第三个需求
        //获取当前时间并与上次记录的时间进行对比
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd");
        Date date = new Date();// 获取当前时间
        String nowDate = sdf.format(date);
        if(nowDate.equals(this.getRecordDate())){
            if(this.getTodayMoney() + money > 5000){
                System.out.println("超过今日（" + this.getRecordDate() + "）5000元取款上限");
                return;
            }
        }
        else{
            this.setRecordDate(nowDate);
        }
        //Heiyu修改了此部分解决了第一个逻辑漏洞
        /*
        if (money > 0){
            this.balance = this.balance - money;
        }else {
            System.out.println("余额不足");
        }*/
        if (this.balance - money > 0){
            this.balance = this.balance - money;
            this.setTodayMoney(this.getTodayMoney() + money);
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