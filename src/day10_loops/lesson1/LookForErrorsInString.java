package day10_loops.lesson1;

public class LookForErrorsInString {
    public static void main(String[] args) {
        String log = "<error:atable style=display: none;<tbody><error:btr id=edit_rubric><td coerror:qlspan=4><form id=error:jedit_rubric_form class=edit-rubric-formerror:p no-margin-bottom>error:a";
        int errorCount = 0;
        String errorType = "";

        for(int a = 0; a <= log.length() - 5; a++){
            if (log.substring(a, a+5).equals("error")){
                errorCount++;
                //errorType += log.charAt(a+6) + ", ";
                errorType += log.charAt(a+6) + ", ";
            }
        }


        errorType = errorType.substring(0, errorType.length()-2);

        if (errorCount > 0){
            System.out.println("FAIL: " + errorCount + " ERRORS DETECTED");
            System.out.println("ERROR TYPE: " + errorType);
        }else {
            System.out.println("PASS: NO ERRORS DETECTED IN THE LOG");
        }
    }
}
