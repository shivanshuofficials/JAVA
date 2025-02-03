package arrays;
import java.util.Scanner;
public class pairs {
    public static void pairs(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int curent = num[i];
            for (int j = i+1; j < num.length; j++) {
                System.out.println("("+curent+","+num[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};
        pairs(num);
    }
}
