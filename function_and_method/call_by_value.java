package function_and_method;

public class call_by_value {
    public static void swap(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        return;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 19;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("swapping values of a and b :");
        
        swap(a, b);
      
    }
}
