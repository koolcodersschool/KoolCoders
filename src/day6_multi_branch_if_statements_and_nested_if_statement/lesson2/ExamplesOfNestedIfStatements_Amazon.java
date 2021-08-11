package day6_multi_branch_if_statements_and_nested_if_statement.lesson2;

public class ExamplesOfNestedIfStatements_Amazon {
    public static void main(String[] args) {
        boolean isPrimeMember = false;
        double totalOrderPrice = 20;

        if(isPrimeMember){
            System.out.println("Eligible for Free shipping");
        }else{
            if(totalOrderPrice >= 25.0){
                System.out.println("Eligible for Free shipping");
            }else{
                System.out.println("Not eligible for Free shipping");
            }
        }

    }
}
