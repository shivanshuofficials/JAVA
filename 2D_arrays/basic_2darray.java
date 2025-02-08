
import java.util.*;

public class basic_2darray {
    public static void search(int arr[][], int key) {
        Scanner sc = new Scanner(System.in);
         key = sc.nextInt();
         int r= arr.length;
         int c = arr[0].length;
         for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.println("Element is present at index ["+i+"]["+j+"]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int r = arr.length, c = arr[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the 2D array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix Elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        search(arr, c);
    }
}
