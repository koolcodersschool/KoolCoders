package day3_math_operators_and_shorthand_operators.lesson1;

public class Calculations {
    public static void main(String[] args){
        double price1 = 15.5;
        double price2 = 55.1;
        double price3 = 10.0;

        double totalPrice = price1 + price2 + price3;

        System.out.println("Total price: " + totalPrice);

        double balance = 1200.0;
        double remainingBalance = balance - totalPrice;
        System.out.println("Remaining balance: " + remainingBalance);

        int linesOfCode = 25;
        int classCount = 6;
        System.out.println("Total lines of code: " + linesOfCode * classCount);
        int totalLinesOfCode = linesOfCode * classCount;
        System.out.println("Total lines of code: " + totalLinesOfCode);
    }
}
