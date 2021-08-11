package day4_scanner.lesson1;

import java.util.Scanner;

public class SalaryCalculatorWithScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter hourly rate:");
        double hourlyRate = scan.nextDouble();
        double weeklySalary = hourlyRate * 40;
        double monthlySalary = weeklySalary * 52 / 12;
        double annualSalary = monthlySalary * 12;

        System.out.println("Your weekly salary: $" + weeklySalary);
        System.out.println("Your monthly salary: $" + monthlySalary);
        System.out.println("Your annual salary: $" + annualSalary);
    }
}
