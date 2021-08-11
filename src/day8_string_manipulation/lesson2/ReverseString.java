package day8_string_manipulation.lesson2;

public class ReverseString {
    public static void main(String[] args) {
        String word = "dad";
        String reversed = "";

        reversed = "" + word.charAt(2) + word.charAt(1) + word.charAt(0);

        System.out.println("reversed = " + reversed);

        if (word.equals(reversed)){
            System.out.println("Palindrome 3 letter word");
        }else{
            System.out.println("Non Palindrome 3 letter word");
        }

        String rev = "";
        rev = rev.concat("abc").concat("wzx");
        System.out.println("rev = " + rev);

    }
}
