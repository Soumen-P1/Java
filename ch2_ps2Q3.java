//Use comparison operators to find out whether a given number is greater than the user entered number or not
import java.util.Scanner;

public class ch2_ps2Q3 {
    public static void main(String[] args) {
        int a = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        System.out.println(b>a);

    }
}
