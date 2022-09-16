package day4.msbank.service;

import day4.msbank.domain.BankCustomer;
import day4.msbank.inter.BankServiceInter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
/**
 * 业务处理类
 */
public class BandServiceImpl implements BankServiceInter{
    //查询
    @Override
    public double queryMoney(BankCustomer bankCustomer) {
        System.out.println(bankCustomer.getUsername()+"的"+"银行卡号："+bankCustomer.getCardId()+"余额为:"+bankCustomer.getBalance()+"元");
        System.out.println("操作成功");
        return bankCustomer.queryMoney();
    }
    //存款业务
    @Override
    public void saveMoney(BankCustomer bankCustomer, double money) {
        bankCustomer.saveMoney(money);
        System.out.println("操作成功");
        System.out.println(bankCustomer.getUsername()+"的"+"银行卡号："+bankCustomer.getCardId()+"余额为:"+bankCustomer.getBalance()+"元");
    }
    //取款业务
    @Override
    public void getMoney(BankCustomer bankCustomer, double money) {
        bankCustomer.getMoney(money);
        System.out.println("操作成功");
        System.out.println(bankCustomer.getUsername()+"的"+"银行卡号："+bankCustomer.getCardId()+"余额为:"+bankCustomer.getBalance()+"元");
    }
    //转账业务
    @Override
    public void transfer(BankCustomer bankCustomer,BankCustomer bankCustomer1,double money){
        if (money > bankCustomer.queryMoney()){
            System.out.println("余额不足");
        }else {
            bankCustomer.getMoney(money);
            bankCustomer1.saveMoney(money);
        }
    }
    //办理银行卡
    @Override
    public BankCustomer initBankInfo() {
        //创建用户和申请银行卡
        BankCustomer bankCustomer = new BankCustomer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请填写银行卡使用人真实姓名");
        String name = scanner.nextLine();
        bankCustomer.setUsername(name);
        System.out.println("请填写银行卡使用人家庭住址");
        String address = scanner.nextLine();
        bankCustomer.setAddress(address);
        System.out.println("请填写银行卡使用人身份证号");
        String ID = scanner.nextLine();
        bankCustomer.setID(ID);
        bankCustomer.setBalance(0);
        //生成银行卡号
        Random ran = new Random();
        boolean flag = true;
        while (flag) {
            int a = ran.nextInt(99999999);
            int b = ran.nextInt(99999999);
            long c = a * 100000000L + b;
            if (c > 1000000000000000L && c < 9999999999999999L) {
                flag = false;
                String num = String.valueOf(c);
                bankCustomer.setCardId(num);
            }
        }
        //计算银行卡生效日期
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        String useDate = sdf.format(date);
        //Heiyu修改了以下几行解决了第三个需求
        sdf.applyPattern("yyyy-MM-dd");
        String recordDate = sdf.format(date);
        bankCustomer.setUseDate(useDate);
        bankCustomer.setRecordDate(recordDate);
        bankCustomer.setTodayMoney(0);
        return bankCustomer;
    }
}