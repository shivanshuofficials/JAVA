package basic_sorting;
public class bubble_sort{
    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn< arr.length-1; turn++) {
            for (int j= 0; j < arr.length-1-turn; j++) {
                //swap
                if (arr[j]> arr[j+1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
            
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
        bubblesort(arr);
        print(arr);
    }
}
