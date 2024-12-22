package function_and_method;

public class binary_to_decimal {
    public static void bindec(int bin) {
        int pow = 0;
        int dec = 0;
        while (bin > 0) {
            int ld = bin % 10;
            dec = dec + ld * (int) Math.pow(2, pow);
            pow++;
            bin = bin / 10;

        }
        System.out.println("decimal =" + dec);

    }

    public static void main(String[] args) {
        bindec(1111);
    }
}
