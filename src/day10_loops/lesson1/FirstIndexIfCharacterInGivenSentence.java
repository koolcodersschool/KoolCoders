package day10_loops.lesson1;

public class FirstIndexIfCharacterInGivenSentence {
    public static void main(String[] args) {
        String word = "Java is fun";
        word = word.toLowerCase();

        char letter = 'a'; // look for this letter in the word
        int index = -1; // assume not there and assign -1

        for(int a = 0; a <= word.length()-1; a++){
            if(word.charAt(a) == letter){
                index = a;
                break; //exit the loop because we need 1st index of 'a'
            }
        }

        System.out.println(letter + " was found at index " + index);



    }
}
