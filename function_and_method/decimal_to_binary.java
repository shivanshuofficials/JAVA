package function_and_method;

public class decimal_to_binary {
    public static void bin(int n){
        int mynum = n;
        int pow =0;
        int bin =0;
        while (n>0) {
            int rem = n%2;
            bin = bin + (int) Math.pow(10, pow) * rem;
            pow++;
            n =n/2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        bin(15);
    }
}
