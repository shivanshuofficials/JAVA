package operator.practice;

public class question3 {
    public static void main(String[] args) {
        int x,y,z;
        x = y = z =2;
        x +=y;
        y-=z;
        z /=(x+y);
        System.out.println(x + "\n" + y + "\n" + z);
    }
}
