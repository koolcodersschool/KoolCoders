package day7_switch_statements_and_string_manipulation.lesson2;

public class CaseConversion {
    public static void main(String[] args) {

        String city = "New York";
        System.out.println(city);

        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());

        System.out.println("city = " + city);

        String lang = "Java";
        System.out.println(lang);
        lang = lang.toUpperCase();
        System.out.println(lang);

        lang = lang.toLowerCase();
        System.out.println(lang);

        //===============================================//
        String word = "Kool Coders";
        // print the word in all uppercase
        System.out.println(word.toUpperCase());

        String uWord = word.toUpperCase();
        System.out.println("uWord = " + uWord);

        System.out.println("word = " + word);
        word = word.toUpperCase();
        System.out.println("word = " + word);

        String lWord = word.toLowerCase();
        System.out.println("lWord = " + lWord);

        if(lWord.equals("kool coders")){
            System.out.println("lowercase");
        }else{
            System.out.println("upperCase");
        }

    }
}
