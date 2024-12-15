package conditional_statements;

import java.util.*;

public class income_tax_calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your income: ");
            int income = sc.nextInt();
            int tax = 0;
            if(income <500000 ){
                System.err.println("your tax is"+tax);
            }
      else if(income <500000 && income > 1000000 ){
      System.out.println("Your income tax : 20% ="+income*0.2);  
            }
            else{
                System.out.println("Your income tax : 30% ="+ income*0.3);
            }
        }
    }
}
