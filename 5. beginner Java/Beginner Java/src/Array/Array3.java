
package Array;


public class Array3 {
    public static void main(String[] args) {
        
//        String[] names=new String[5];
//        names[0]="Anis";
//        names[1]="Tuli";
//        names[2]="Mofiz";
//        names[3]="Arif";
//        names[4]="Mawa";
//        
//        for (int i = 0; i <names.length; i++) {
//            System.out.println(names[i]);
//        }

//String[] names={"Anis","Tuli","Mofiz","Arif","Mawa"};
//
//        System.out.println(names.length);
//
//        for (int i = 0; i <names.length; i++) {
//            System.out.println(names[i]);
//        }


/**
 * using of for each loop
 */
//String[] names={"Anis","Tuli","Mofiz","Arif","Mawa"};
//        for (String x : names) {
//            System.out.println(x);
//        }
        
       /**
        * sum using for each loop
        */ 
        int[] num={10,20,30,40,50,60,70,80,90,100};
        int sum=0;
        for (int x : num) {
            sum=sum+x;
        }
        System.out.println(sum);
    }
  
}
