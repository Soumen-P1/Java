//write a program to find factorial of a given number using for loop

import java.util.Scanner;

public class ch5_ps5Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the number");
        int n = sc.nextInt();
        int k=1;
        for(int i=1; i<=n; i++){
            k = k*i;
        }
        System.out.println("The factorial of "+n+" is "+k);
    }
}
