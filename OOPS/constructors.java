public class constructors {
    public static void main(String[] args) {
            men m = new men();
         

    }
}
class men {
    String name;
    int age;
    String gender;
    //default constructor
    men(){
       System.out.println("i am a men constructor");
    }
    //parameterized constructor
    men(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //copy constructor
    

  

}
