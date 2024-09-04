//Rock-Paper-Scissors

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

public class ch4_ps4Q00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 2: ");
        int p1 = sc.nextInt();

        if(p1==0){
            System.out.println("Rock");
        }
        else if(p1==1){
            System.out.println("Paper");
        }
        else if(p1==2){
            System.out.println("Scissor");
        }
        else{
            System.out.println("Invalid input");
        }

        Random rnd = new Random();
        int p2 = rnd.nextInt(3);

        if(p2==0){
            System.out.println("Rock");
        }
        else if(p2==1){
            System.out.println("Paper");
        }
        else if(p2==2){
            System.out.println("Scissor");
        }
        else{
            System.out.println("Invalid input");
        }

        //0 = rock
        //1 = paper
        //2 = scissor

        if(p1==0 && p2==1){
            System.out.println("Sorry! You Lose");
        }
        else if(p1==0 && p2==2){
            System.out.println("Yeah!! You Win");
        }
        else if(p1==1 && p2==0){
            System.out.println("Yeah!! You Win");
        }
        else if(p1==1 && p2==2){
            System.out.println("Sorry! You Lose");
        }
        else if(p1==2 && p2==0){
            System.out.println("Sorry! You Lose");
        }
        else if(p1==2 && p2==1){
            System.out.println("Yeah!! You Win");
        }
        else{
            System.out.println("Play Again!!!!");
        }
        System.out.println("Thank You For Playing");
    }
}
