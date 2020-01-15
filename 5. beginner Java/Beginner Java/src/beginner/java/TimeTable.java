
package beginner.java;

import java.util.Scanner;


public class TimeTable {
    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        int num;
//        System.out.print("Enter any number : ");
//        num=input.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            
//            System.out.println(num+"*"+i+" = "+num*i);
//        }
       

Scanner input= new Scanner(System.in);
int m,n;

        System.out.print("please enter initial number : ");
        m=input.nextInt();

 System.out.print("please enter last number : ");
        n=input.nextInt();
        
        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" X "+j+" = "+i*j);
            }
            System.out.println("\n\n");
            
        }

    }
}
