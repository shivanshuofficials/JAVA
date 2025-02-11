package Strings;

public class sub_string {
    public static void substrings(String str,int si, int ei) {
        String sub = "";
        for (int i = si; i < ei; i++) {
            sub += str.charAt(i);

        }
        System.out.println(sub);
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.substring(3,5)); // lo
        System.out.println(str.substring(0, 5)); // Hello
         substrings(str, 1, 5);//ello
    }
}
