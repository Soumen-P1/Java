//Write a program to find out the type of website from the url
//      .com -> Commercial website
//      .org -> Organisation Website
//      .in  -> Indian Website

import java.util.Scanner;

public class ch4_ps4Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url: ");
        String url = sc.next();

        if(url.endsWith(".com")){
            System.out.println("It is a commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("It is a organisational website");
        }
        else if(url.endsWith(".in")){
            System.out.println("It is a indian website");
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
