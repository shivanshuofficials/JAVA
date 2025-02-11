package Strings.practice;

public class question1 { // Fixed class name capitalization

    // Function to count total vowels in a string
    public static int countTotalVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU"; // Including uppercase vowels

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    // New function to count occurrences of each vowel separately
    public static void countEachVowel(String str) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (char ch : str.toLowerCase().toCharArray()) { // Convert to lowercase
            switch (ch) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        // Printing vowel counts only if they appear in the string
        System.out.println("Vowel Counts:");
        if (a > 0)
            System.out.println("a = " + a);
        if (e > 0)
            System.out.println("e = " + e);
        if (i > 0)
            System.out.println("i = " + i);
        if (o > 0)
            System.out.println("o = " + o);
        if (u > 0)
            System.out.println("u = " + u);
    }

    public static void main(String[] args) {
        String str = "zzzzz";

        // Calling the vowel count functions
        System.out.println("Total Vowel Count: " + countTotalVowels(str));
        countEachVowel(str);
    }
}
