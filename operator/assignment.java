package operator;

public class assignment {
    public static void main(String[] args) {
        // = assignment operator
        int a = 10;
        int b = 20;
        int c = a = b;
        a -= 25;//decrease value
        a +=10;//increase value

        System.out.println("Value of a: " + c);
        System.out.println("Value of a: " + a);



    }
}
