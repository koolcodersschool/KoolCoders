package day9_loops_while_doWhile_and_for_loop.lesson2;

public class MultiplicationTableWithForLoop {
    public static void main(String[] args) {
        int num = 3;


        if (num < 1 || num > 10){
            System.out.println("ERROR: Invalid number");
            // return; // stop here. end the main method
            System.exit(0); //stop here. more powerful version
        }
        System.out.println("Multiplication table for: " + num);

        for(int a = 1; a <= 10; a++){
            int result = a * num;
            System.out.println(a + " x " + num + " = " + result);
        }


    }
}
