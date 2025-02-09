package pactice_question;

public class question3 {
    //transpose of a matrix
    public static void transpose(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
           
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            
            }  
        }
    }
    public static void print(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
                }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
            };
            System.out.println("Original Matrix: ");
            print(matrix);
            transpose(matrix);
            System.out.println("Transpose of Matrix: ");
            print(matrix);
             }
    }
