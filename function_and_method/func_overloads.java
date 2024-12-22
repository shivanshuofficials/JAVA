package function_and_method;

public class func_overloads{
    public static int sum (int a, int b){
        return a+b;
        }
        public static int sum (int a, int b, int c){
            return a+b+c;
            }

  public static void main(String[] args) {
    System.out.println("sum of two num = "+sum(5,6));
    System.out.println("sum of three num = "+sum(5,6,8));
  }
}