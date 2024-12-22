package function_and_method;

public class func_overload2 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("the sum of int values = " + sum(3, 5));
        System.out.println("the sum of float values = " + sum(3.0f, 5.0f));
    }
}
