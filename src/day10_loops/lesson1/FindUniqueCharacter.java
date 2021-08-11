package day10_loops.lesson1;

import java.util.Scanner;

public class FindUniqueCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word!");
        String str = scan.nextLine();
        String unique = "";

        for(int a = 0; a <= str.length()-1; a++){
            String temp = str.charAt(a) + "";
            if(!unique.toLowerCase().contains(temp.toLowerCase())){
                unique += temp;
            }
        }
        System.out.println("unique = " + unique);
    }
}
