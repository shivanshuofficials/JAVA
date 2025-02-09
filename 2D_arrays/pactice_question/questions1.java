package pactice_question;

public class questions1 {
    public static void print_duplicate(int array[][], int key) {
        //print total no of duplicates in array.
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == key) {
                    count++;
                    }
                    }
                    }
                    System.out.println("Total no of duplicates in array is " + count);
    }

    public static void main(String[] args) {
        int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
      
        print_duplicate(array, 8);
       

    }
}