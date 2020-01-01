      
package beginner.java;

import java.util.Scanner;

   
public class Loop1 {
    public static void main(String[] args) {
        /**
         * print sum of all the numbers from 1 to 10
         */
//        int sum=0;
//        for(int i=1;i<=10;i++){
//           sum=sum+i; 
//        }
//        System.out.println("The sum is : "+sum);
        
        
        /**
         * print sum of all the numbers from m to n
         * input take from user
         */
//        Scanner input = new Scanner(System.in);
//        
//        int m,n;
//        int sum=0;
//        
//        System.out.print("Enter initial number : ");
//        
//        m=input.nextInt();
//        
//        System.out.print("Enter final number : ");
//        n=input.nextInt();
//        for(int i=m;i<=n;i++){
//            sum=sum+i;
//        }
//        System.out.println("The sum is : "+sum);
    
    /**
         * print sum of all the even numbers from m to n
         * input take from user
         */
    
//    Scanner input = new Scanner (System.in);
//    int m,n;
//    int sum=0;
//        System.out.print("Enter initial number: ");
//    m=input.nextInt();
//    
//     System.out.print("Enter final number: ");
//    n=input.nextInt();
//    for(int i=m;i<=n;i++){
//        if(i%2==0){
//            sum=sum+i;
//            System.out.print(" "+i);
//        }
//        
//    }
//        System.out.println();
//        System.out.println("The sum is : " +sum);
    
    Scanner input=new Scanner (System.in);
    int m,n;
    int sum=0;
        System.out.print("Enter initial number : ");
        m=input.nextInt();
        
        System.out.print("Enter final number : ");
        n=input.nextInt();
        
   for(int i=m;i<=n;i++){
       if(i%2==0){
           sum=sum+i;
           System.out.print(" "+i);
       }
       
   }
        System.out.println();
        System.out.println("The sum is : "+sum);   
    }
    
    
    }
    

