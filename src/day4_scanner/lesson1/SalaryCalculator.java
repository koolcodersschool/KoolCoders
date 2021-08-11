package day4_scanner.lesson1;

public class SalaryCalculator {
    public static void main(String[] args){
        double hourlyRate = 54;
        double weeklySalary = hourlyRate * 40;
        double monthlySalary = weeklySalary * 52 / 12;
        double annualSalary = monthlySalary * 12;

        System.out.println("Your Weekly Salary: $" + weeklySalary);
        System.out.println("Your monthly Salary: $" + monthlySalary);
        System.out.println("Your annual Salary: $" + annualSalary);


    }
}
