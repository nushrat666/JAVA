
package data.type;


public class DataType {

    
    public static void main(String[] args) {
//        int num1 =10;
//        double num2 =10.5;


//boolean b;
//char c;
//short s;
//int i;
//float f;
//double d;
//
//b=true;
//        System.out.println("b = "+b); //b equal= printing the value of b 
//        
//        c='a';
//        System.out.println("c = "+c);
   
    /*work in one step which is called dynamic initialization*/
//    boolean b=true;
//    char c='a';
//    short s= 32677;
//    int i= 126587;
//    float f= 12.8f;
//    double d= 10.8;
//            
//        System.out.println("boolean b = "+b);
//        System.out.println("c = "+c);
//        System.out.println("s = "+s);
//        System.out.println("i = "+i);
//        System.out.println("f = "+f);
//        System.out.println("d = "+d);

/*using of printf*/

/**
 * %b is format specifier , its for boolean
 * %c is for character
 * %d is for short, integer
 * %f is for float,double
 */
 boolean b=true;
 char c= 'a';
 short s= 32677;
 int i= 126587;
 float f= 12.8f;
 double d= 10.8;
 
        System.out.printf("boolean b = %b\n",b);
        System.out.printf("character c = %c\n",c);
        System.out.printf("short s = %d\n",s);
        System.out.printf("int i = %d\n",i);
        System.out.printf("float f = %.2f\n",f); //want to show two digit after point
        System.out.printf("double d = %.3f\n",f);//want to show three digit after point




    }
    
}
