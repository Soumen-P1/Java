//write a program to find out whether a given integer is present in an array or not

import java.util.Scanner;

public class ch6_ps6Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int [] arr = {10,50,60,90,60,30};
        for(int i=0; i<=5; i++){
            if(arr[i]==num){
                System.out.println("Yes!, Available");
                break;
            }
            else{
                System.out.println("Not Available");
            }

        }
    }
}
