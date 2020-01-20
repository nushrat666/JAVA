
package Array;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int[][] A=new int[2][3];
        int[][] B=new int[2][3];
        
        //getting input for A matrix
        System.out.print("please enter values for A : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                  
              A[row][col]=input.nextInt();
            }
        }
        //getting input for B Matrix
        System.out.print("please enter values for B : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                
               B[row][col]=input.nextInt();
            }
            
        }
        
        //printing A matrix
        System.out.println("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+A[row][col]);
            }
            System.out.println();
        }
        
        
        
        
        //printing B Matrix
         System.out.println("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+B[row][col]);
            }
            System.out.println();
        }
        
        
    }
  
}
