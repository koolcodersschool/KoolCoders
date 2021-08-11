package day6_multi_branch_if_statements_and_nested_if_statement.lesson2;

public class CreditScore {
    public static void main(String[] args) {
        int score = 777;

        if(score >= 750 && score <= 850){
            System.out.println("Excelent");
        }else if(score >= 700 && score <= 749){
            System.out.println("Good");
        }else if(score >= 650 && score <= 699){
            System.out.println("Fair");
        }else if(score >= 550 && score <= 649){
            System.out.println("Poor");
        }else if(score >= 0 && score <= 549){
            System.out.println("Bad");
        }else{
            System.out.println("Invalid number");
        }
    }
}
