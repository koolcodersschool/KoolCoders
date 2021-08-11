package day7_switch_statements_and_string_manipulation.lesson2;

public class StringCharAt {
    public static void main(String[] args) {
        String company = "kool coders";
        System.out.println(company.length());

        System.out.println(company.charAt(0));
        System.out.println(company.charAt(1));
        System.out.println(company.charAt(2));
        System.out.println(company.charAt(3));
        System.out.println(company.charAt(4));
        System.out.println(company.charAt(5));
        System.out.println(company.charAt(6));
        System.out.println(company.charAt(7));
        System.out.println(company.charAt(8));
        System.out.println(company.charAt(9));
        System.out.println(company.charAt(10));

        char first = company.charAt(0);
        System.out.println("first = " + first);

        if (first == 'k'){
            System.out.println(first + " is the first letter");
        }else{
            System.out.println(first + " is not first letter");
        }


        String word = "civic"; // palindrome word

        // read first and last characters and store into firstL, lastL variable

        char firstL = word.charAt(0);
        char lastL = word.charAt(4); // word.charAt(word.length() - 1)

        if (firstL == lastL){
            System.out.println("First and last match");
        }else{
            System.out.println("First and last do not match");
        }

        System.out.println(word.charAt(0) + " " + word.charAt(1) + " " + word.charAt(2) + " " + word.charAt(3) + " " + word.charAt(4));









    }
}
