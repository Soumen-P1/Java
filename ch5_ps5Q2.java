//write a program to sum 1st n even numbers using while loop


import java.util.Scanner;

public class ch5_ps5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the value of n: ");
        int n = sc.nextInt();
        int i=0;
        while(n!=0){

            i = i + n;
            n--;
        }
        System.out.println(i);
    }
}
