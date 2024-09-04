//Write a java program to convert a string to lower case

import java.util.Locale;
import java.util.Scanner;

public class ch3_ps3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write down the string ");
        String str = sc.nextLine();

        String finalStr = str.toLowerCase();
        System.out.println(finalStr);

    }
}
