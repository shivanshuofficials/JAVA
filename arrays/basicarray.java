package arrays;
import java.util.*;

public class basicarray {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0]= sc.nextInt();
        marks[2]= sc.nextInt();
        marks[3]= sc.nextInt();
        
        System.out.println("phy"+marks[0]);        

        System.out.println("maths"+marks[2]);

       System.out.println("science"+marks[3]);
       //percentage 
       int percentage = (marks[0] + marks[2] + marks[3])/3;
       System.out.println(percentage);
       
    System.out.println("length of array"+marks.length);
    }
}
