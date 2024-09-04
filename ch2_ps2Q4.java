//write the following expression in a java program
//     V2 - U2
//     -------
//       2as
import java.util.Scanner;
public class ch2_ps2Q4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the value of V - ");
        float V = sc1.nextFloat();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the value of U - ");
        float U = sc2.nextFloat();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the value of a - ");
        float a = sc3.nextFloat();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter the value of s - ");
        float s = sc4.nextFloat();

        float k = (V*V - U*U) / 2*a*s;
    }
}
