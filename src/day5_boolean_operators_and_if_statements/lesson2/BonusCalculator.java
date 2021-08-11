package day5_boolean_operators_and_if_statements.lesson2;

public class BonusCalculator {
    public static void main(String[] args) {
        double salary = 1000.0;
        double sales = 10000.0;
        double bonus = 0.0;

        if(sales >= 10000.0){
            bonus += 500;
            salary = salary + bonus;
        }else{
            bonus += 50;
            salary = salary + bonus;
        }

        System.out.println("Your total salary is $" + salary + " and it includes bonus of $" + 500);
    }
}
