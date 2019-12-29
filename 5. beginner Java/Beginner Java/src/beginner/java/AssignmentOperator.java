
package beginner.java;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x=3;
        int y=2;
        
//        int result= x+=y;
//        System.out.println(result);
    
    x+=y; //it means x= x+y=5
        System.out.println("x : "+x);
        
        
         x-=y; //it means x= x-y=5-2=3
        System.out.println("x : "+x);
        
         x*=y; //it means x= x*y=*2=6
        System.out.println("x : "+x);
        
         x/=y; //it means x= x/y=6/2=3
        System.out.println("x : "+x);
        
         x%=y; //it means x= x%y=3%1=1
        System.out.println("x : "+x);
    
    }
}
