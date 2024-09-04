//write a program to find out whether a student is pass or fail;
//if it requires total 40% and at least 33% in each subject to pass.
//Assume 3 subjects and take marks as an input from the user.
import java.util.Scanner;

public class ch4_ps4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the 1st subject: ");
        float sub1 = sc.nextFloat();

        System.out.println("Enter the marks of the 2nd subject: ");
        float sub2 = sc.nextFloat();

        System.out.println("Enter the marks of the 3rd subject: ");
        float sub3 = sc.nextFloat();

        float avg = (sub1 + sub2 + sub3)/3.0f;

        if (avg >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >=33){
            System.out.println("You are pass");
        }
        else{
            System.out.println("You are fail");
        }
    }
}
