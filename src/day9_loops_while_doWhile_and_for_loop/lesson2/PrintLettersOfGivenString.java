package day9_loops_while_doWhile_and_for_loop.lesson2;

public class PrintLettersOfGivenString {
    public static void main(String[] args) {
        String name = "kool coders";

        for(int a = 0; a < name.length(); a++){
            System.out.println(a + ": " + name.toUpperCase().charAt(a));
        }
        System.out.println();
        for(int b = name.length()-1; b >= 0; b--){
            System.out.println(b + ": " +name.charAt(b));
        }






    }
}
