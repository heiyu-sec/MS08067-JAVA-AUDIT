package day4.msbank;

import day4.msbank.domain.BankCustomer;
import day4.msbank.inter.BankServiceInter;
import day4.msbank.service.BandServiceImpl;

import java.util.Scanner;

public class Test {
    static BankCustomer bankCustomers[] = new BankCustomer[2];
    static int count = 0;
    static boolean flag = true;
    public static void main(String[] args) {
        while (flag){
            useSystem(flag);
        }
    }
    public static void useSystem(boolean flag){
        System.out.println("请选择操作选项");
        System.out.println("1：开通银行卡");
        System.out.println("2: 查询");
        System.out.println("3：存款");
        System.out.println("4：取款");
        System.out.println("5：转账");
        System.out.println("6：退出系统");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        switch (result){
            case 1:  //开通银行卡
                applyBankCard();
                break;
            case 2:  //查询余额
                System.out.println("请选择需要查询余额银行卡的用户");
                for (int i = 0; i < bankCustomers.length; i++) {
                    System.out.println(String.valueOf(i)+":"+"姓名："+bankCustomers[i].getUsername()+","+"卡号："+bankCustomers[i].getCardId()+"，余额:"+bankCustomers[i].getBalance()+"元");
                }
                int type2 = scanner.nextInt();
                queryMoney(type2);
                break;
            case 3: //存款
                System.out.println("请选择需要存款的银行卡的用户");
                for (int i = 0; i < bankCustomers.length; i++) {
                    System.out.println(String.valueOf(i)+":"+"姓名："+bankCustomers[i].getUsername()+","+"卡号："+bankCustomers[i].getCardId()+"，余额:"+bankCustomers[i].getBalance()+"元");
                }
                int type3 = scanner.nextInt();
                System.out.println("请输入存款金额");
                Double money3 = scanner.nextDouble();
                saveMoney(type3,money3);
                break;
            case 4: //取款
                System.out.println("请选择需要取款的银行卡的用户");
                for (int i = 0; i < bankCustomers.length; i++) {
                    System.out.println(String.valueOf(i)+":"+"姓名："+bankCustomers[i].getUsername()+","+"卡号："+bankCustomers[i].getCardId()+"，余额:"+bankCustomers[i].getBalance()+"元");
                }
                int type4 = scanner.nextInt();
                System.out.println("请输入取款金额");
                Double money4 = scanner.nextDouble();
                getMoney(type4,money4);
                break;
            case 5: //转账
                System.out.println("请选择转账来源用户");
                for (int i = 0; i < bankCustomers.length; i++) {
                    System.out.println(String.valueOf(i)+":"+"姓名："+bankCustomers[i].getUsername()+","+"卡号："+bankCustomers[i].getCardId()+"，余额:"+bankCustomers[i].getBalance()+"元");
                }
                int type5 = scanner.nextInt();
                System.out.println("请选择转账目的用户");
                for (int i = 0; i < bankCustomers.length; i++) {
                    System.out.println(String.valueOf(i)+":"+"姓名："+bankCustomers[i].getUsername()+","+"卡号："+bankCustomers[i].getCardId()+"，余额:"+bankCustomers[i].getBalance()+"元");
                }
                int type6 = scanner.nextInt();
                System.out.println("请输入账号金额");
                double money6 = scanner.nextDouble();
                transfer(type5,type6,money6);
                break;
            case 6:
                flag = false;
        }
    }
    public static void applyBankCard(){
        BankServiceInter bandService = new BandServiceImpl();
        //1、模拟开通两张银行卡
        System.out.println("请输入A用户信息");
        bankCustomers[0] = bandService.initBankInfo();
        System.out.println("您已成功申请银行卡，详细信息如下：");
        System.out.println("银行卡激活日期："+bankCustomers[0].getUseDate());
        System.out.println("用户姓名："+bankCustomers[0].getUsername());
        System.out.println("家庭住址："+bankCustomers[0].getAddress());
        System.out.println("当前余额："+bankCustomers[0].getBalance());
        System.out.println("开卡身份证号码："+bankCustomers[0].getID());
        System.out.println("请输入B用户信息");
        bankCustomers[1] = bandService.initBankInfo();
        System.out.println("您已成功申请银行卡，详细信息如下：");
        System.out.println("银行卡激活日期："+bankCustomers[1].getUseDate());
        System.out.println("用户姓名："+bankCustomers[1].getUsername());
        System.out.println("家庭住址："+bankCustomers[1].getAddress());
        System.out.println("当前余额："+bankCustomers[1].getBalance());
        System.out.println("开卡身份证号码："+bankCustomers[1].getID());
    }
    public static void queryMoney(int type){
        BankServiceInter bandService = new BandServiceImpl();
        bandService.queryMoney(bankCustomers[type]);
    }
    public static void getMoney(int type,double money){
        BankServiceInter bandService = new BandServiceImpl();
        bandService.getMoney(bankCustomers[type],money);
    }
    public static void saveMoney(int type,double money){
        BankServiceInter bandService = new BandServiceImpl();
        bandService.saveMoney(bankCustomers[type],money);
    }
    public static void transfer(int type1,int type2,double money){
        BankServiceInter bandService = new BandServiceImpl();
        bandService.transfer(bankCustomers[type1],bankCustomers[type2],money);
    }
}
