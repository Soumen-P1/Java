//Calculate income tax
// income slot      Tax
//  2.5L-5.0L       5%
//  5.0L-10.0L      20%
//  Above 10.0L     30%

import java.util.Scanner;

public class ch4_ps4Q3 {
    public static void main(String[] args) {
    float tax = 0;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter yout income in lakhs per annum: ");
    float income = sc.nextFloat();

    if(income<=2.5f){
        tax = tax + 0;
    }
    else if(income>2.5f && income<=5.0f){
        tax = tax + 0.05f * (income-2.5f);
    }

    else if(income>5.0f && income<=10.0f){
        tax = tax + 0.05f * (5.0f-2.5f);
        tax = tax + 0.2f * (income-5.0f);
    }

    else if(income>10.0f){
        tax = tax + 0.05f * (5.0f-2.5f);
        tax = tax + 0.2f * (10.0f-5.0f);
        tax = tax + 0.3f * (income-10.0f);
    }
        System.out.println("The total tax payed by the employee is: " +tax);
    }

}
