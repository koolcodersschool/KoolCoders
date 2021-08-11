package day5_boolean_operators_and_if_statements.lesson1;

import java.util.Scanner;

public class BuildAnEmail {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your new Company");
        String firsName, lastName, companyName, email;

        System.out.println("Enter firstname , lastname, company name:");
        firsName = scan.next();
        lastName = scan.next();
        companyName = scan.next();
        email = firsName + "_" + lastName + "@" + companyName + ".com";
        System.out.println("Your email: " + email);
    }
}
