package day3;

public class Person {
    private String name;
    private int age;
    private String sex;
    public Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println(this.name + "'s Age: " + this.age);
    }
    public void addAge(int i){
        this.age = this.age + i;
        System.out.println(this.name + "'s age + 1");
    }
}