//write a java program to convert kilometers to miles


import java.util.Scanner;

public class ch1_prblm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in Kilometers");
        float km = sc.nextFloat();
        float miles = km*0.621f;
        System.out.println("The distance in Miles is: "+miles);


    }
}
