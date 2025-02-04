package basic_sorting;
import java.util.Arrays;
public class inbuilt_sort {

    public static void print(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 9};
        System.out.println("original array:");
        print(arr);
        Arrays.sort(arr);
        System.out.println("sorted array:");
        print(arr);
        
    }
}
