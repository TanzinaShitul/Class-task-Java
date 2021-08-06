package Tanzina;

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student(158);
        Student obj3 = new Student("Tanzina", 158);

        System.out.println(obj2.id);
        System.out.println(obj3.name + " " + obj3.id);

        obj1.display();
    }
}

    /*
        Name:Tanzina Akther
        ID: 2012020158
        Section: D
        Email: cse_2012020158@lus.ac.bd
        Date: 7th August, 2021
    */


