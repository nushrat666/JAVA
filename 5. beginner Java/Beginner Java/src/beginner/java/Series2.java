
package beginner.java;

import java.util.Scanner;

public class Series2 {
    /**
     * 1*2*3*......*n
     */
    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        int n;
//        int result=1;
//        System.out.print("Enter the last number : ");
//        n=input.nextInt();
//        for (int i = 1; i <= n; i++) {
//           
//            result=result*i;
//            System.out.print(" "+i);
//        }
//        System.out.println();
//        System.out.println("The Multiplication is : "+result);


/**
     * 1*3*5*......*n
     */
//Scanner input = new Scanner (System.in);
//int n,result=1;
//        System.out.print("Enter the last : ");
//        n=input.nextInt();
//        for (int i = 1; i <=n; i++) {
//            if(i%2!=0){
//            result=result*i;
//            System.out.print(" "+i);
//        }
//        }
//        System.out.println();
//        System.out.println("The Multiplication is : "+result);
        
        
        
        /**
     * 1.5*2.5*3.5*......*n
     */
Scanner input = new Scanner (System.in);
double n,result=1;
        System.out.print("Enter the last : ");
        n=input.nextInt();
        for (double i = 1.5; i <=n; i++) {
            if(i%2!=0){
            result=result*i;
            System.out.print(" "+i);
        }
        }
        System.out.println();
        System.out.println("The Multiplication is : "+result);
    }
}
