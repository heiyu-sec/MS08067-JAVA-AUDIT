package day3;

public class Circle {
    static double PI =3.14;
    private int r;
    public Circle (int r){
        this.r=r;
    }
    public void calS(){
        System.out.println("S:"+(PI*r*r));
    }
}
