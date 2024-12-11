import java.util.*;;
public class bill {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            float pen = sc.nextFloat();
            float pencil = sc.nextFloat();
            float eraser = sc.nextFloat();
            float bill = (pen + pencil + eraser);
            float gst = 0.18f*bill+bill;
      System.out.println("the bill without gst"+bill);
      System.out.println("the bill incuded gst"+gst);
        }

    }
}
