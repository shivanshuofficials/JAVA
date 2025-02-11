package Strings;

public class compare_func {
    public static void main(String[] args) {
        String name1 = "shivanshu";
        String name2 = "shivanshu";
        String name3 = new String("shivanshu");
        if ( name1 == name2){
            System.out.println("name1 and name2 are equal");
        }
        else{
            System.out.println("name1 and name2 are not equal");
            
        }
        if ( name1 == name3){
            System.out.println("name1 and name3 are equal");
        }
        else{
            System.out.println("name1 and name3 are not equal");
            
        }
        if ( name1.equals(name3)){
            System.out.println("name1 and name3 are equal");
        }
        else{
            System.out.println("name1 and name3 are not equal");
            
        }
    }
}
