package day6_multi_branch_if_statements_and_nested_if_statement.lesson1;

public class CalculatorVersion1 {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 30.0;

        char operator = '-';

        if(operator == '+'){
            System.out.println(num1 + num2);
        }else if(operator == '-'){
            System.out.println(num1 - num2);
        }else if(operator == '*'){
            System.out.println(num1 * num2);
        }else if(operator == '/'){
            System.out.println(num1/num2);
        }else{
            System.out.println("there is no such a operator");
        }
    }
}
