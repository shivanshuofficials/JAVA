package arrays;
public class update {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i]=marks[i]+1;
            System.out.println("update values"+ marks[i]);
        }
    }
    public static void main(String[] args) {
        int marks[]={99,88,77};
        update(marks);
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(" "+marks[i]+"");
        // }
        // System.out.println();
    }
}
