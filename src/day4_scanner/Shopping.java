package day4_scanner;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Harris Teeter!");
        System.out.println("How much are potatoes? ");
        double pricePotatoes = scan.nextDouble();

        System.out.println("How much are tomatoes?");
        double priceTomatoes = scan.nextDouble();

        System.out.println("How much are eggplants?");
        double priceEggplants = scan.nextDouble();

        double totalPrice = pricePotatoes + priceTomatoes + priceEggplants;
    }
}
