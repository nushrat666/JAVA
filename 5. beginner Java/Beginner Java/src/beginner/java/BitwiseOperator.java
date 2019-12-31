
package beginner.java;


public class BitwiseOperator {
    public static void main(String[] args) {
//        int a=32;
//        int b=12;
//        int c;
//        
//        c=a&b;//bitwise and
//        System.out.println("a & b = "+c);
//        
//        c=a|b;
//        System.out.println("a | b = "+c);//bitwise or
//        
//         c=a^b;
//        System.out.println("a ^ b = "+c);//bitwise X-or
        
        
        /*
        >> right shift bitwise operator
        << left shift bitwise operator
        */
             int a=32;
             
      int c;
            c=a>>3;
       System.out.println("a >> b = "+c); //output 4
       
       c=a<<3;
       System.out.println("a << b = "+c); // output 256
    }
}
