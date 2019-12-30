
package beginner.java;

import java.util.Scanner;


public class CelciusToFarenheit {
    public static void main(String[] args) {
        /**
         * F=(9/5)C+32
         */
        
        Scanner input = new Scanner (System.in);
        
        double celcius;
        
        System.out.print("Enter celcius value : ");
        
         celcius=input.nextDouble();
        double Farenheit=(double)1.8*celcius+32;
        
        System.out.println("Farenhiet = "+Farenheit);
    }
}
