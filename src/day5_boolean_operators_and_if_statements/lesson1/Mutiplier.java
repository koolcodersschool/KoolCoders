package day5_boolean_operators_and_if_statements.lesson1;

import java.util.Scanner;

public class Mutiplier {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Multiplier!");
        System.out.println("Enter 2 numbers:");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = num1 * num2;
        String print = num1 + " X " + num2 + " = " + result;
        System.out.println(print);
    }
}
