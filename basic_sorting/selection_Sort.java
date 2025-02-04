package basic_sorting;
public class selection_Sort {
        public static void selsectionsort(int arr[]) {
            for (int i = 0; i < arr.length-1; i++) {
                int min =i;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[min]>arr[j]) {
                        min = j;
                    }
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }
        public static void print(int arr[]) {
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        print(arr);
        System.out.println("Sorted array:");
        selsectionsort(arr);
        print(arr);
}
}