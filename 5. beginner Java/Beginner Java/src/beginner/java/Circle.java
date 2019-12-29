
package beginner.java;

import java.util.Scanner;


public class Circle {
    public static void main(String[] args) {
         Scanner input =new Scanner (System.in);
        
        double radius;
          
        System.out.print("radius : ");  
        radius=input.nextDouble();
                
        
        
        double Area=3.1416*radius*radius;
        
        System.out.println("Area of Circle : "+Area);
    }
    
   
}
