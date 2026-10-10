package AdvancedTest.Practice1;

public class Student {
    private String name;
    private int age;
    private double length;
    private double weight;
    private String hobby;

    public Student(String name, int age, double length, double weight, String hobby) {
        this.name = name;
        this.age = age;
        this.length = length;
        this.weight = weight;
        this.hobby = hobby;
    }

    public Student() {
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
