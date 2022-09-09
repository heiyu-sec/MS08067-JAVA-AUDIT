package day3;

public class Day3Task5 {
    public static void main(String[] args) {
        NewPerson person1 = new NewPerson("River", 23);
        NewPerson person2 = new NewPerson("Osier", 25, "BJUT");
        NewPerson person3 = new NewPerson("pikaqiu", 3, "BJUT", "Computer Science");
        System.out.println("输出第一个人的信息：");
        System.out.printf("Name: " + person1.getName());
        System.out.printf(" Age: " + person1.getAge());
        System.out.printf(" School: " + person1.getSchool());
        System.out.println(" Major: " + person1.getMajor());
        System.out.println("输出第二个人的信息：");
        System.out.printf("Name: " + person2.getName());
        System.out.printf(" Age: " + person2.getAge());
        System.out.printf(" School: " + person2.getSchool());
        System.out.println(" Major: " + person2.getMajor());
        System.out.println("输出第三个人的信息：");
        System.out.printf("Name: " + person3.getName());
        System.out.printf(" Age: " + person3.getAge());
        System.out.printf(" School: " + person3.getSchool());
        System.out.println(" Major: " + person3.getMajor());
    }
}
