package pattern.live_sessions;

public class pyramid_pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int i, j;

        // Loop for each row
        for (i = 0; i < n; i++) {
            // Print spaces
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
