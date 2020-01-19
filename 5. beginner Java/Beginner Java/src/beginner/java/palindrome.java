
package beginner.java;

import java.util.Scanner;


public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum=0,r,temp,num;
        System.out.print("Enter any number : ");
        num=input.nextInt();
        
        temp=num;
        
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        System.out.println("Reverse number : "+sum);
        if(num==sum){
            System.out.println("This is a palindrome Number");
        }else{
            System.out.println("It's not a palindrome Number");
        }
    }
 
}
