
package beginner.java;

import java.util.Scanner;


public class VowelConsonent2 {
    public static void main(String[] args) {
       /**
        * we use logical or operator
        */ 
       
       Scanner input = new Scanner (System.in);
       
       char ch;
       
        System.out.print("Enter any letter: ");
        
        ch=input.next().charAt(0);
        if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
            System.out.println("Vowel");
        
    }else{
            System.out.println("Consonent");
        }
    }
}
