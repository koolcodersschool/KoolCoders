package day9_loops_while_doWhile_and_for_loop.lesson1;

import java.util.Scanner;

public class Ask100DollarsUntilYouGetIt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me 100 Dollars");
        int num1 = scan.nextInt();

        //int num1 = 0;

        while (num1 != 100){
            System.out.println("Give me 100 Dollars");
            num1 = scan.nextInt();
        }
        System.out.println("Thank you for 100 Dollars");

    }
}
