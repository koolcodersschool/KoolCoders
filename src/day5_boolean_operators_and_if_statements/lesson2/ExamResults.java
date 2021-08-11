package day5_boolean_operators_and_if_statements.lesson2;

public class ExamResults {
    public static void main(String[] args){
        int passingScore = 60;
        int score = 60;

        if(score >= passingScore){
            System.out.println("Congratulations, you Passed the exam!");
        }else{
            System.out.println("You failed.");
            System.out.println("Please study more and try again");
        }
    }
}
