package operator;

public class logical {
    public static void main(String[] args) {
        // AND (&&)
        System.out.println((3>2) && (5>3));
        // t && t = t
        // t && f = f
        // f && t = f
        // f && f = f


        // OR (||)
        int a = 5;
        int b = 3;
        System.out.println((a>b) || (a<b));
        // t || t = t
        // t || f = t
        // f || t = t
        // f || f = f

        //NOT (!)
         System.out.println(!(a>b));
         // t = f
         // f = t

    
}
}
