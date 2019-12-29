/*
 area of triangle=1/2*base*height
 */
package beginner.java;

import java.util.Scanner;

/**
 *
 * @author new
 */
public class AreaOfTriangle {
    
    public static void main(String[] args) {
        
        Scanner input =new Scanner (System.in);
        
        double base;
        System.out.print("base : ");  
        base=input.nextDouble();
                
        double height;
        System.out.print("height : ");  
        height=input.nextDouble();
        
        double Area=0.5*base*height;
        
        System.out.println("Area of Triangle : "+Area);
    }
    
}
