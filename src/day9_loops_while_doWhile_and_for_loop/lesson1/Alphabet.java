package day9_loops_while_doWhile_and_for_loop.lesson1;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'A';
        while (letter <= 'Z'){
            System.out.print(letter + " ");
            letter++;
        }

        System.out.println();
        letter--;
        //or letter = 'z';
        //or you can use new variable


        while (letter >= 'A'){
            System.out.print(letter + " ");
            letter--;
        }

        System.out.println();

        char myLetter = 'A';
        String alphabet = "";

        while (myLetter <= 'Z'){
            alphabet += myLetter;
            System.out.println(alphabet);
            myLetter++;
        }

        System.out.println();

        char yourLetter = 'Z';
        String newAlphabet = "";

        while (yourLetter >= 'A'){
            newAlphabet += yourLetter;
            System.out.println(newAlphabet);
            yourLetter--;
        }
        System.out.println();
        System.out.println(newAlphabet);
        int count = 26;
        while (count >= 1){
            newAlphabet = newAlphabet.substring(0,count);
            System.out.println(newAlphabet);
            count--;
        }




    }
}
