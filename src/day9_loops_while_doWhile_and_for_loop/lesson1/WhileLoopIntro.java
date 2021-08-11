package day9_loops_while_doWhile_and_for_loop.lesson1;

public class WhileLoopIntro {
    public static void main(String[] args) {
        int num = 1;
//        while (num <= 10){ // infinite loop
//            System.out.println("Hello World");
//        }


        while (num <= 10){
            System.out.println("Hello World");
            num++;
        }


        // create a variable steps and assign 1 to it.
        // write a while loop to repeat 100 times.
        // each time print "Taking a step 1"

        int steps = 1;
        while (steps <= 100){
            System.out.println("Taking a step " + steps);
            steps++;
        }
        System.out.println("steps = " + steps);

    }
}
