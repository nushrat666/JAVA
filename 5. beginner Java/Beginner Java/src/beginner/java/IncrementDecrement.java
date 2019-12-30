
package beginner.java;

public class IncrementDecrement {
    public static void main(String[] args) {
        /**
         * post increment
         */
//        int x=25;
//        int y;
//        
//        y=x++; //post increment
//        System.out.println("y = "+y); //value is 25, not increased
//        
//        y=x; //post increment
//        System.out.println("y = "+y); //value is 26, because it get another x
    
    
    /**
         * pre increment
         */
//        int x=25;
//        int y;
//        
//        y=++x; //pre increment
//        System.out.println("y = "+y); //value is 26,  increased because it is pre increment
//        
//        y=x; 
//        System.out.println("y = "+y); //here also value is 26, because it is prefix
   
    /**
     * practice part
     */
    
    int x=25;
    int y;
    
    y=--x;
        System.out.println("y = "+y); //y=24
            
    y=x--;//post fix
        System.out.println("y = "+y); //y=24
        
        y=++x;//because it is post fix y=x--, again then get x in y=++x, thats why 24-1=23
              //then for y=++x, it should be 23+1=24
        System.out.println("y = "+y); //y=24
        
        y=x++;
        System.out.println("y = "+y); //y=24
    
    }
    
    
}
