/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginner.java;

import java.util.Scanner;

/**
 *
 * @author new
 */
public class PrimeNumberdetect {
    public static void main(String[] args) {
        /**
          * show prime number from initial number to ending number
          
          */   
         
//         Scanner input=new Scanner(System.in);
//         int m,n;
//         int count=0;
//         System.out.print("Enter initial number : ");
//         m=input.nextInt();
//         
//         System.out.print("Enter ending number : ");
//         n=input.nextInt();
//         
//         for (int i = m; i<=n; i++) {
//             for (int j = 2; j <=i-1; j++) {
//                 if(i%j==0){
//                     count++;
//                     break;
//                 }
//             }
//             if (count==0) 
//                 System.out.println(i);
//                 count=0;
//             
//        }

/*
show also total prime number
*/

Scanner input =new Scanner (System.in);
int m,n,count=0,totalPrime=0;

        System.out.print("Enter initial number : ");
        m=input.nextInt();
        
        System.out.print("Enter ending number : ");
        n=input.nextInt();
        
        for (int i = m; i <=n; i++) {
            for (int j = 2; j <=i-1; j++) {
                if (i%j==0) {
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.println(i);
                totalPrime++;
            }
            count =0;
        }
            System.out.println("Total Prime Number is : "+totalPrime);
        }
    }

