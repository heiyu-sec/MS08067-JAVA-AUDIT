package day3;

public class NewPerson {
    private String name;
    private int age;
    private String school;
    private String major;
    public NewPerson(String n, int a){
        this.name = n;
        this.age = a;
    }
    public NewPerson(String n, int a, String s){
        this.name = n;
        this.age = a;
        this.school = s;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public NewPerson(String n, int a, String s, String m){
        this.name = n;
        this.age = a;
        this.school = s;
        this.major = m;
    }
}
