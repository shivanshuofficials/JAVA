package Strings;

import java.util.Scanner;

public class length_property {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your caste: ");
        String caste = sc.next();
        System.out.println("My name is: "+ name+" "+caste);
        String length = name + caste;
        System.out.println("Length of name: "+length.length());
    }
}
