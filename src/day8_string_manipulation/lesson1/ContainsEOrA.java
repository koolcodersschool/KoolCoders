package day8_string_manipulation.lesson1;

public class ContainsEOrA {
    public static void main(String[] args) {
        String name = "Pavel";

        if (name.contains("e") || name.contains("a")){
            System.out.println("There is e or a in " + name);
        }else{
            System.out.println("There is no e or a in " + name);
        }

    }
}
