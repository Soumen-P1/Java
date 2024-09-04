//calculate the average marks from an array containing marks of all students in physics using for each loop

import java.util.Scanner;

public class ch6_ps6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student 1 put your physics number: ");
        int p1 = sc.nextInt();
        System.out.println("Student 2 put your physics number: ");
        int p2 = sc.nextInt();
        System.out.println("Student 3 put your physics number: ");
        int p3 = sc.nextInt();
        System.out.println("Student 4 put your physics number: ");
        int p4 = sc.nextInt();
        System.out.println("Student 5 put your physics number: ");
        int p5 = sc.nextInt();

        float [] marks = new float [5];
        marks[0] = p1;
        marks[1] = p2;
        marks[2] = p3;
        marks[3] = p4;
        marks[4] = p5;

        float sum = 0;

        for(float element:marks){
            sum = sum + element;



        }
        System.out.println("Average is "+sum/ marks.length);
    }
}
