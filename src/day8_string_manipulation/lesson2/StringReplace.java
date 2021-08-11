package day8_string_manipulation.lesson2;

public class StringReplace {
    public static void main(String[] args) {
        String words = "sad, cry, python";
        System.out.println(words.replace("sad", "happy"));
        System.out.println(words.replace("cry", "smile"));
        System.out.println(words.replace("python", "java"));
        System.out.println(words);

        words = words.replace("sad", "happy");
        words = words.replace("cry", "smile");
        words = words.replace("python", "java");
        System.out.println(words);

        words = words.replace("sad, cry, python", "happy, smile, java");
        System.out.println(words);

        words = words.replace("smile", "smile".toUpperCase()); // or just type SMILE
        System.out.println(words);

        words = words.replace(", ", "|");
        System.out.println(words);

        String capital = "London is capital of UK";
        capital = capital.replace("London", "Baku");
        capital = capital.replace("UK", "Azerbaijan");
        System.out.println(capital);

        capital = capital.replace("Baku","Washington DC").replace("Azerbaijan", "USA");
        System.out.println("capital = " + capital);


    }
}
