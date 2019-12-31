
package beginner.java;

public class Break {
    public static void main(String[] args) {
        
//        for(int i=1;i<=100;i++){
//        
//            if(i==10)
//                break;
//            
//            System.out.println(i);
//        
//        }


/**
 * 1+2=3
 * 3+2=5
 * 5+7=9
 * 9+2=11 which is skip 10, that's why output is continue till 99
 */

   for(int i=1;i<=100;i=i+2)
        {
            if(i==10){
                break;
            }
            System.out.println(i);
        } 
    
    
    }
}
