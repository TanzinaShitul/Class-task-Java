package Tanzina;

public class Student {
    String name;
    int id;
    static String universityName = "Leading University";

    public Student() {
        System.out.println("default constructor");
    }

    public Student(int id) {
        this.id = id;
        System.out.println("one parameterized constructor");
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Two parameterized constructor");
    }

    void display() {
        System.out.println(universityName);
    }
}

    /*
        Name: Tanzina Akther
        ID: 2012020158
        Section: D
        Email: cse_2012020158@lus.ac.bd
        Date: 7th August, 2021
    */
