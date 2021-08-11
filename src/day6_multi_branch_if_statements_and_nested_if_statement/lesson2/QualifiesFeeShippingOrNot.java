package day6_multi_branch_if_statements_and_nested_if_statement.lesson2;

import java.util.Scanner;

public class QualifiesFeeShippingOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        boolean isPrimeMember;
        double totalOrderPrice = 0;


        System.out.println("Welcome to Amazon shopping?");

        System.out.println("Are you prime member?");
        answer = scan.next();
        if(answer.equalsIgnoreCase("yes")){
            isPrimeMember = true;
        }else{
            isPrimeMember = false;
        }


        System.out.println("Enter total order price:");
        totalOrderPrice = scan.nextDouble();

        if(totalOrderPrice < 0){
            System.out.println("Invalid Order Price");
            return;
        }

        if(isPrimeMember == true || totalOrderPrice >= 25){
            System.out.println("Your order is eligible for free shipping");
        }else{
            System.out.println("Your order is not eligible for free shipping");
        }




    }
}
