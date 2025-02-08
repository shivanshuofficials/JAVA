package basic_sorting.practice_questions;
//bubble sort in descending order

public class question1 {
    public static void bubble(int arr[]) {
        for(int turn = 0;turn<arr.length-1;turn++ ){
            for (int j = 0; j < arr.length-1-turn; j++) {
                    if (arr[j]<arr[j+1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println("Original array: ");
        print(arr);
        System.out.println("\n");
        bubble(arr);
        System.out.println("Sorted array: ");
        print(arr);

    }
}
