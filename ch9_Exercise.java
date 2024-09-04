//create a class game, which allows a user to play "Guess The Number" game once
//      1. Constructor to generate a random number
//      2. takeUserInput()
//      3. is CorrectNumber() to detect whether the number entered by the user is true
//      4. getter and setters for noOfGuesses()
//      5. use properties such as noOfGuesses(int)
import java.util.Random;
import java.util.Scanner;

class Game{

    public Game(){
        Random rnd = new Random();
        int r = rnd.nextInt(100);
    }
    static void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

    } 
}

public class ch9_Exercise {
    public static void main(String[] args) {
        Game Exercise = new Game();
        System.out.println();
    }
}
