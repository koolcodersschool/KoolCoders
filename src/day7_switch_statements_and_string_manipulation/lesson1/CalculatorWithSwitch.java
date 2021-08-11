package day7_switch_statements_and_string_manipulation.lesson1;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 3;

        char operator = '*';

        switch (operator){
            case '+':
                System.out.println(num1 + num2);
                break; // exit from switch case. go outside switch
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("There is no such operator");
        }
    }
}
