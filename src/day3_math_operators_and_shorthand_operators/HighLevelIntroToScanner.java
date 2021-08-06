package day3_math_operators_and_shorthand_operators;

import java.util.Scanner;

public class HighLevelIntroToScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Nice to meet you, " + name);
    }
}
