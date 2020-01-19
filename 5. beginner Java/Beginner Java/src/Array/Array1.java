
package Array;


public class Array1 {
    public static void main(String[] args) {
       /**
        * array declare
        */ 
//        int[] number;
//        number=new int[5];


/**
        * array declare+creation
        * index always start with zero and it will be always positive
        */ 
int[] number =new int[5];

/**
 * value store
 * initialization
 */
number[0]=10;
number[1]=10;
number[2]=10;
number[3]=10;
number[4]=10;

/*
printing
*/
        System.out.println(number[0]);
        
        
        /**
         * declaring size of array
         */
        
        int length=number.length;
        System.out.println("Array size : "+length);
        
        /**
         * sum of all index
         */
        
        int sum=number[0]+
number[1]+
number[2]+
number[3]+
number[4];
        
        System.out.println(sum);
    }
}
