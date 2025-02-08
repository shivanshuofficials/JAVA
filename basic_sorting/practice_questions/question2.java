package basic_sorting.practice_questions;
//insertion sort in descending order
public class question2{
    public static void insertion(int arr[]) {
       for (int i = 0; i < arr.length; i++) {
        int curr = arr[i];
        int prev =i-1;
        while (prev >= 0 && arr[prev] < curr) {
            arr[prev + 1] = arr[prev];
            prev--;
            }
            arr[prev + 1] = curr;
       }

    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {    
        int[] arr = {5, 2, 8, 1, 9};
        System.out.println("Original array: ");
        print(arr);
        insertion(arr);
        System.out.println("Sorted array: ");
        print(arr);
        
    }
}