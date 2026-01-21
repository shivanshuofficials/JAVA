

public class Basics{
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.SetColor("Blue");
        p1.SetTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        Student p2 = new Student();
        System.out.println(p2.name);
    }

}

class pen{
    String color;
    int tip;
    void SetColor (String newColor){
        color = newColor;
    }
    void SetTip (int newTip){
        tip = newTip;
    }
    
}

class Student {
    String name = "Shivani";
    int age;
    String college;
    String branch;
    public void printDetails(){
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My college is " + college);
        System.out.println("My branch is " + branch);
    }

}