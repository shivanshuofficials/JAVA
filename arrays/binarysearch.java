package arrays;
public class binarysearch {
    public static int binarysearch(int num[],int key) {
        int start =0;
        int end = num.length-1;
        while (start <= end) {
            int mid = (start + end )/2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]= {0,1,02,3,4,5};
        int key = 2;
        System.out.println("\nthe value found at index"+ binarysearch(num, key));
    }
}
