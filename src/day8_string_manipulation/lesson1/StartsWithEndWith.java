package day8_string_manipulation.lesson1;

public class StartsWithEndWith {
    public static void main(String[] args) {
        String word = "kool coders";

        System.out.println(word.startsWith("k")); // true
        System.out.println(word.startsWith("kool")); // true
        System.out.println(word.startsWith("r")); // false


        System.out.println(word.endsWith("s")); //true
        System.out.println(word.endsWith("coders")); //true


        String website = "wwww.koolcoders.org";

        if (website.endsWith(".com")){
            System.out.println("English site");
        }else if(website.endsWith(".edu")){
            System.out.println("College site");
        }else if(website.endsWith(".gov")){
            System.out.println("Government site");
        }else if(website.endsWith(".org")){
            System.out.println("This is us");
        }



    }
}
