
package Array;

import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int[][] A= new int[3][3];
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col]=input.nextInt();
            }
            
        }
        System.out.println("please enter a number : ");
    }
    
}
