package Strings;

public class string_builder {
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("hello");
    String name = " world";
    for (char i = 0; i < name.length(); i++) {
        sb.append(name.charAt(i));

    }
    System.out.println(sb);
    System.out.println(sb.length());
}
    
}