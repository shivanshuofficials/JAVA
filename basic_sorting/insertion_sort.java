package basic_sorting;

public class insertion_sort {
    public static void insertion(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr=arr[i];
            int prev = i-1;
             while ( prev>=0 && arr[prev]> curr) {
                arr[prev+1] = arr[prev];
                prev--;
             }
             //insertion
             arr[prev+1] = curr;
        }

    }

public static void print(int arr[]) {
    for (int k = 0; k < arr.length; k++) {
        System.out.print(arr[k]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[] ={20,78,69,65,47};
        System.out.println("Original array");
        print(arr);
        System.out.println("Sorted array");
        insertion(arr);
        print(arr);

    }
}
