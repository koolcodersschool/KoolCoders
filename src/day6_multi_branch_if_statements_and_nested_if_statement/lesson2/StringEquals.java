package day6_multi_branch_if_statements_and_nested_if_statement.lesson2;

public class StringEquals {
    public static void main(String[] args){
        String str = "java";
        String str2 = new String("java");

        // compare using ==
        System.out.println(str == "java"); // true
        System.out.println(str2 == "java"); // false

        // compare using  .equals()
        System.out.println(str.equals("java")); // true
        System.out.println(str2.equals("java")); // true
        System.out.println(str2.equals("Java")); // false

        //compare using .equalsIgnoreCase
        System.out.println(str.equalsIgnoreCase("JAVA")); // true
        System.out.println(str2.equalsIgnoreCase("Java")); // true

        //compare with variables
        System.out.println(str.equalsIgnoreCase(str2)); //true
        System.out.println(str.equals(str2)); // true
        System.out.println(str == str2); // false

    }
}
