package Strings;

public class largest_string {
    public static void main(String[] args) {
        String fruits[] = { "apple", "banana", "mango", "orange", "grapes" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if ( largest.compareTo(fruits[i])<0) {
                largest = fruits[i];
            }
        }
        System.out.println("Largest string is: " + largest);
    }
}
