
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
    
    Scanner input = new Scanner (System.in);
    
    int number;
    
        System.out.println("Enter any number : ");
        number=input.nextInt();
        
        System.out.println("Number = "+number);
    
    }
}
