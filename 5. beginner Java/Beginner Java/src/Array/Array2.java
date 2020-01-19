package Array;

import java.util.Scanner;

public class Array2 {

    /**
     * take 5 inputs and create their sum and Average
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];

        double sum = 0;
        System.out.print("Please enter 5 numbers : ");

//        number[0]=input.nextDouble();
//        number[1]=input.nextDouble();
//        number[2]=input.nextDouble();
//        number[3]=input.nextDouble();
//        number[4]=input.nextDouble();
//        for (int i = 0; i <5; i++) {
//            number[i]=input.nextDouble();
//        }
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
//        sum=number[0]+number[1]+number[2]+number[3]+ number[4];

//        for (int i = 0; i < 5; i++) {
//            sum=sum+number[i];
//        }
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("The sum is : " + sum);

        /**
         * finding average
         */
//         System.out.println("The sum is : "+sum/5);
//        System.out.println("The sum is : "+sum/number.length);
//double avg=sum/5;
//        System.out.println("Average is : "+avg);
        double avg = sum / number.length;
        System.out.println("Average is : " + avg);
        
        /**
         * finding max min
         */
        
        double max=number[0];
        
        for (int i = 1; i < 5; i++) {
            if (max<number[i]) {
                max=number[i];
            }
        }
        System.out.println("Maximum : "+max);
        
        
        double min = number[0];
        for (int i = 1; i < 5; i++) {
            if (min>number[i]){
                min=number[i];
            }
        }
        System.out.println("Minimum : "+min);
    }
}
