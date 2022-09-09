package day3;

public class Day3Task1{
    public static void main(String[] args) {
        Person p1 = new Person("River", 23, "Boy");
        p1.showAge();
        p1.addAge(1);
        p1.showAge();
        Person p2 = new Person("Osier", 3, "Girl");
        p2.showAge();;
        p2.addAge(3);
        p1.addAge(2);
        p1.showAge();
        p2.showAge();
    }
}