//Write a java program to replace space with underscores

import java.util.Scanner;

public class ch3_ps3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String ");
        String str = sc.nextLine();

        String new_str = str.replace(" ","_");
        System.out.println(new_str);

    }
}
