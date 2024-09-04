//write a java program which asks user to enter his/her name.Then print "Hello <name>, have a good day".

import java.util.Scanner;
public class ch1_prblm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String str = sc.next();
        System.out.println("Hello "+str+", have a good day.");

    }
}
