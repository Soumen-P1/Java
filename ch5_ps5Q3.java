//Write a program to print multiplication table of a given number n


import java.util.Scanner;

public class ch5_ps5Q3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.print(i*n+"\t");

        }
    }
}
