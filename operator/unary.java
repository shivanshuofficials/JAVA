package operator;

public class unary {
    public static void main (String args[]){
       //post increment
        int a = 10;
        int b = a++;
        System.out.println("value of a= "+ a);
        System.out.println("value of b= "+ b);
    //    pre increment
       int c = 10;
       int d = ++c;
       System.out.println("value of c = "+ c);
       System.out.println("value of d= "+ d);
    
       //post increment
        int e = 10;
        int g = e--;
        System.out.println("value of e= "+ e);
        System.out.println("value of g= "+ g);
    //    pre increment
       int f = 10;
       int h = --f;
       System.out.println("value of f = "+ f);
       System.out.println("value of h= "+ h);
    }
}
