/*
Name : Tanzina Akther
ID : 2012020158
Section : D
Email: cse_2012020158@lu.ac.bd
Date : 12/07/2021
*/
package tanzina;

import java.util.Scanner;


public class Tanzina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String section ;
       System.out.print("Enter Section: ");
       section = input.nextLine();
       System.out.println("Section: "+section);
       
       Info info = new Info();
        System.out.println("Name: "+info.name);
        System.out.println("ID: "+info.id);
        
       Hobby hobbyName = new Hobby();
         System.out.println("Hobby: "+hobbyName.hobby);
    }
    
}
