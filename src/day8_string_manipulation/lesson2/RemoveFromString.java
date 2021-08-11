package day8_string_manipulation.lesson2;

public class RemoveFromString {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String withNoSpaces = sentence.replace(" ", "");
        System.out.println("sentence = " + sentence);
        System.out.println("withNoSpaces = " + withNoSpaces);

        String withNoIs = sentence.replace("is ","");
        System.out.println("withNoIs = " + withNoIs);

        String etsyRresults = "iphone case” (212,714 Results)";
        etsyRresults = etsyRresults.replace("iphone case” (","")
                .replace(" Results)","")
                .replace(",","");
        System.out.println("etsyRresults = " + etsyRresults);

        String mixed = "!@J#$A%^VA*(";
        mixed = mixed.replace("!@","")
                .replace("#$","")
                .replace("%^","")
                .replace("*(","");
        System.out.println("mixed = " + mixed);

    }
}
