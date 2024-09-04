//Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard.
import java.util.Scanner;
public class ch1_Prblm1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number in the 1st subject");
        int sub1 = sc1.nextByte();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the number in the 2nd subject");
        int sub2 = sc2.nextByte();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the number in the 3rd subject");
        int sub3 = sc3.nextByte();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter the number in the 4th subject");
        int sub4 = sc4.nextByte();

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter the number in the 5th subject");
        int sub5 = sc5.nextByte();

        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total number is: "+sum);

        float percentage = (sum*100)/500f;
        System.out.println("The percentage is: "+percentage);
    }
}
