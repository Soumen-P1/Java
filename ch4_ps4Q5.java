//Write a java program to find whether a year entered by the user is a leap year or not

import java.util.Scanner;

public class ch4_ps4Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year: ");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.println("This is a leap year");
    }else{
            System.out.println("Not a leap year");
        }
}
}