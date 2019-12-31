
/**
 * Nushrat Jahan Tuli
 * B.Sc. in Computer Science & Engineering
 * Android Developer
 * Mobile: 01615349666
 */


package beginner.java;


public class Continue {
    public static void main(String[] args) {
//        for(int i=1;i<=100;i++){
//            if(i==10){
//            continue;
//            }
//            System.out.println(i);
//        }
    
//    for(int i=1;i<=100;i=i+3){
//            if(i==10){
//            continue;
//            }
//            System.out.println(i);
//        }//1 4 7 13 ...
//   
    /**
     * confused output
     */

for(int i=1;i<=100;i=i+3){
           if(i==10){
         continue; // 1 4 7 13 ...
         }
           if(i>13){
               break; //1 4 7
           }
       System.out.println(i);
    }

    }
   
}
