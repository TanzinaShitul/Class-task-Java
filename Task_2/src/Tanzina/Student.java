package Tanzina;

public class Student {
    String name;
    int id;
    static String universityName = "Leading University";

    Student() {
        System.out.println("default constructor");
    }

    Student(int id) {
        this.id = id;
        System.out.println("parameterized constructor");
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("parameterized constructor");
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
