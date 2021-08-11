package day8_string_manipulation.lesson2;

public class MergeIt {
    public static void main(String[] args) {
        String pattern = "^[]^";
        String word = "java";

        String merged = pattern.substring(0,2) + word + pattern.substring(2,4);
        System.out.println("merged = " + merged);

    }
}
