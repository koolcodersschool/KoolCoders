package day10_loops.lesson1;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word to check if it is polindrome");
        String word = scan.nextLine();

        word = word.toLowerCase();
        word = word.replace(" ", "");

        String reversed = "";

        for(int a = word.length() - 1; a >= 0; a--){
            reversed += word.charAt(a);
        }

        if (word.equals(reversed)){
            System.out.println(word + " is Polindrome");
        }else{
            System.out.println(word + " is Not Polindrome");
        }

        System.out.println("word = " + word);

        System.out.println("reversed = " + reversed);

    }
}
