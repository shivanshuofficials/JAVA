package Strings;
import java.util.*;

public class basic_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your caste: ");
        String caste = sc.next();
        System.out.println("My name is: "+ name+" "+caste);
    }
}