import java.util.*;;

public class question4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the year :");
            int year = sc.nextInt();
            if (year % 4 == 0) {
                System.out.println("this is leap year!");
            }
            else {
                System.out.println("this is not leap year!");
            }
        }
}

}
