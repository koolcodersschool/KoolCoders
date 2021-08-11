package day9_loops_while_doWhile_and_for_loop.lesson1;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(10);
        int guessingNumber = 0;

        do{
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber > secretNumber){
                System.out.println("Wrong your number is too large");
            }else if(guessingNumber < secretNumber){
                System.out.println("Wrong your number is too low");
            }

        }while(guessingNumber != secretNumber);
        System.out.println("Congratulations, you won");

    }
}
