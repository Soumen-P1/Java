//Write a java program to fill in a template which looks like below
//            letter = "Dear<\name\>, Thanks a lot"

import java.util.Scanner;

public class ch3_ps3_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The name ");
        String str = sc.next();

        String letter = "Dear <|name|>, Thanks a lot";
        letter  = letter.replace("<|name|>",str);
        System.out.println(letter);
    }
}
