
package beginner.java;

import java.util.Scanner;

public class ArithmeticOperator {
    
    public static void main(String[] args) {
//        int num1,num2,result;
//        
//        num1=20;
//        num2=10;
//        
//        result = num1+num2;
//        
//        System.out.println("SUM = "+result);
//        
//        result = num1-num2;
//        
//        System.out.println("SUB = "+result);
//        
//        result = num1*num2;
//        
//        System.out.println("Multiplication = "+result);
//        
//        result = num1/num2;
//        
//        System.out.println("Divide = "+result);
//        
//        result = num1%num2;
//        
//        System.out.println("Modulas = "+result);
    
    /**
     * need input from user
     */
    
//    Scanner input = new Scanner (System.in);
//     
//    int num1,num2,result;
//    
//    
//        System.out.print("Please enter First number : ");
//        num1=input.nextInt();
//        System.out.print("Please enter Second number : ");
//    
//        num2=input.nextInt();
//        
//        
//         result=num1+num2;
//    
//    
//        System.out.println("Result is : "+result);
    
/**
 * want double type output
 */
    Scanner input = new  Scanner (System.in);
int num1, num2;

        System.out.print("num1 :");
        num1=input.nextInt();
        
        System.out.print("num2 :");
        num2=input.nextInt();
        
        double result= (double) num1/num2;
        
        System.out.println("Result :"+result);
        
    }
    
}
