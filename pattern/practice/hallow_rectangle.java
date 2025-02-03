package pattern.practice;

public class hallow_rectangle {
    public static void hallow_rec(int r, int c){
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i ==1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hallow_rec(10, 7);
    }
}
