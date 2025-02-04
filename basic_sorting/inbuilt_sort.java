package basic_sorting;
import java.util.*;
public class inbuilt_sort {

    public static void print(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void print(Integer array[]) {
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 9};
        System.out.println("original array:");
        print(arr);
        Arrays.sort(arr,0,3);
        System.out.println("sorted array from index 0 to 3:");
        print(arr);
        Arrays.sort(arr);
        System.out.println("sorted array:");
        print(arr);
        
        Integer array[] = {5, 2, 8, 1, 9};
        System.out.println("original array:");
        print(array);
        Arrays.sort(array,0,3,Collections.reverseOrder());
        System.out.println("sorted array from index 0 to 3:");
        print(array);
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("sorted array:");
        print(array);

    }
}
