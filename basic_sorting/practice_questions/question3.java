package basic_sorting.practice_questions;
//selection sort in descending order
public class question3 {
    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j=i+1; j < arr.length; j++) {
                if (arr[min]<arr[j]) {
                    min =j;
                }
            }
            //swap 

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        System.out.println("Original array: ");
        print(arr);
        System.out.println("sorted array: ");
        selection(arr);
        print(arr);
    }
}
