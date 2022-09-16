package day4.msbank.domain;

public abstract class BankCard {
    private String cardId; //银行卡号
    private String cardType; //银行类类型（储蓄卡||信用卡）
    private String useDate; //使用起始日期
    double  balance; //余额
    //Heiyu增加了以下两个属性以解决第三个需求
    private double todayMoney;
    private String recordDate;
    public abstract void saveMoney(double money);//存款
    public abstract void getMoney(double money);//取款
    public abstract double queryMoney();//查询余额
    public String getCardId() {
        return cardId;
    }
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
    public String getCardType() {
        return cardType;
    }
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public String getUseDate() {
        return useDate;
    }
    public void setUseDate(String useDate) {
        this.useDate = useDate;
        this.recordDate = useDate;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getTodayMoney() {
        return todayMoney;
    }
    public void setTodayMoney(double todayMoney) {
        this.todayMoney = todayMoney;
    }
    public String getRecordDate() {
        return recordDate;
    }
    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }
}