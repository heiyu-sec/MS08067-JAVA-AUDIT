package day3;

public class Calculator {
    private double cal1;
    private double cal2;
    private char type;
    public Calculator(double cal1, double cal2, char type){
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.type = type;
    }
    public double getCal1() {
        return cal1;
    }
    public void setCal1(double cal1) {
        this.cal1 = cal1;
    }
    public double getCal2() {
        return cal2;
    }
    public int setCal2(double cal2) {
        this.cal2 = cal2;
        return 0;
    }
    public char getType() {
        return type;
    }
    public void setType(char type) {
        this.type = type;
    }
    public int cal(){
        switch (type) {
            case '+':
                System.out.println(cal1 + cal2);
                break;
            case '-':
                System.out.println(cal1 - cal2);
                break;
            case '*':
                System.out.println(cal1 * cal2);
                break;
            case '/':
                System.out.println(cal1 / cal2);
                break;
            default:
                System.out.println("Unknown type");
                break;
        }
        return 0;
    }
}
