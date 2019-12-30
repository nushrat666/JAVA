
package beginner.java;

import java.util.Scanner;


public class PositiveDemo {
    public static void main(String[] args) {
        
        /**
     * if 
     */
        
//        Scanner input =new Scanner (System.in);
//        
//        int num;
//        
//        System.out.print("Enter number : ");
//        
//        num=input.nextInt();
//        
//        if(num>0){
//            System.out.println("Positive");
//        }
    
    
    /**
     * if else
     */
    
  
    
//     Scanner input =new Scanner (System.in);
//        
//        int num;
//        
//        System.out.print("Enter number : ");
//        
//        num=input.nextInt();
//        
//        if(num>0){
//            System.out.println("Positive");
//        }
//        else{
//            System.out.println("Negative");
//        }
//        
        
        /**
     * else if
     */
    
  
    
     Scanner input =new Scanner (System.in);
        
        int num;
        
        System.out.print("Enter number : ");
        
        num=input.nextInt();
        
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0) {
            System.out.println("Negative");
        }else
        {
            System.out.println("Zero");
        }
}
}
