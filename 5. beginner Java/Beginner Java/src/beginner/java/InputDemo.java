
package beginner.java;

import java.util.Scanner;


public class InputDemo {
    public static void main(String[] args) {
     
//        int number =120;
//        
//        System.out.println("number = "+number);
    
    /**
     * take user input and print it
     */
    
//    Scanner input = new Scanner (System.in);
//    
//    int number;
//    
//        System.out.print("Enter any number : ");
//        number=input.nextInt();
//        
//        System.out.println("Number = "+number);
    
        /**
     * take user input name and print it
     */
        
//        Scanner input =new Scanner (System.in);
//        
//        String name;
//        
//        System.out.print("Enter your name : ");
//        
//        //name= input.next(); //its only read first part of name
//        
//        name=input.nextLine(); //its read total name
//        System.out.println("Welcome "+name);


/**
     * take user input double and print it
     */
Scanner input =new Scanner (System.in);
double number;
System.out.print("Enter any number : ");

number=input.nextDouble(); //use for double input value
System.out.println("Number = "+number);

    }
}
