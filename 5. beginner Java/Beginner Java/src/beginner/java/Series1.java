
package beginner.java;

import java.util.Scanner;


public class Series1 {
    public static void main(String[] args) {
//        /**
//         * 1+2+three+.......+n=Sum ?
//         */
//        
//       Scanner input =new Scanner (System.in) ;
//       
//       int n;
//       int sum = 0;
//        System.out.print("Enter the last number : ");
//        n=input.nextInt();
//        for (int i = 1; i <= n; i=i+1) {
//            
//            sum= sum+i;
//            System.out.print(" "+i);
//        }
//        System.out.println();
//        System.out.println("The sum is : "+sum);
    
    


///**
//         * 1+three+5.......+n=Sum ?
//         */
//        
//       Scanner input =new Scanner (System.in) ;
//       
//       int n;
//       int sum = 0;
//        System.out.print("Enter the last number : ");
//        n=input.nextInt();
//        for (int i = 1; i <= n; i=i+2) {
//            
//            sum= sum+i;
//            System.out.print(" "+i);
//        }
//        System.out.println();
//        System.out.println("The sum is : "+sum);
    
    
//    /**
//         * 2+4+6.......+n=Sum ?
//         */
//        
//       Scanner input =new Scanner (System.in) ;
//       
//       int n;
//       int sum = 0;
//        System.out.print("Enter the last number : ");
//        n=input.nextInt();
//        for (int i = 2; i <= n; i=i+2) {
//            
//            sum= sum+i;
//            System.out.print(" "+i);
//        }
//        System.out.println();
//        System.out.println("The sum is : "+sum);


///**
//         * 1.5+2.5+three point five.......+n=Sum ?
//         */
//        
//       Scanner input =new Scanner (System.in) ;
//       
//       double n;
//       double sum = 0;
//        System.out.print("Enter the last number : ");
//        n=input.nextDouble();
//        for (double i = 1.5; i <= n; i=i+1) {
//            
//            sum= sum+i;
//            System.out.print(" "+i);
//        }
//        System.out.println();
//        System.out.println("The sum is : "+sum);


/**
         * 1^2+2^2+3^2+4^2.......+n^2=Sum ?
         */
        
       Scanner input =new Scanner (System.in) ;
       
       int n;
       int sum = 0;
        System.out.print("Enter the last number : ");
        n=input.nextInt();
        for (int i = 1; i <= n; i=i+1) {
            
            sum= sum+i*i;
            System.out.print(" "+i+"*"+i);
        }
        System.out.println();
        System.out.println("The sum is : "+sum);
    
    }
}
