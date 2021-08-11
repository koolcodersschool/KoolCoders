package day8_string_manipulation.lesson2;

import java.util.Scanner;

public class SwapTheWordsEnteredWithScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 words");

        String word = scan.nextLine();
        String convertedWord = "";

        convertedWord = word.substring(word.indexOf(" ")+1).toUpperCase() + " " + word.substring(0, word.indexOf(" ")).toUpperCase();

        System.out.println("convertedWord = " + convertedWord);


    }
}
