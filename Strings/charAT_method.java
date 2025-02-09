package Strings;

import java.util.Scanner;

public class charAT_method {

    public static void count( String lengths) {
        for (int i = 0; i < lengths.length(); i++) {
            System.out.println( "Character at " + i + " Position: " + lengths.charAt(i));
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your caste: ");
        String caste = sc.next();
        System.out.println("My name is: "+ name+" "+caste);
        String lengths = name + caste;
        System.out.println("Length of name: "+lengths.length());
        count(lengths);
    }
}
