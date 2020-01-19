
package beginner.java;

import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum=0,r,temp,num;
        System.out.print("Enter any number : ");
        num=input.nextInt();
        
        temp=num;
        
        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        System.out.println("Armstrong number : "+sum);
        if(num==sum){
            System.out.println("This is a Armstrong Number");
        }else{
            System.out.println("It's not a Armstrong Number");
        }
    }
}
