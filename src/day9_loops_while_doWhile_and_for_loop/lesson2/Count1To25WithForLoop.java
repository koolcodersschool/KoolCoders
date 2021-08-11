package day9_loops_while_doWhile_and_for_loop.lesson2;

public class Count1To25WithForLoop {
    public static void main(String[] args) {

        // print 1 to 10 using for loop
        for(int num = 1; num <= 25; num++){
            System.out.print(num + " ");
        }
        System.out.println();

        // infinite loop using for loop
//        for(;;){
//            System.out.println("Java is Fun!!");
//            break; // in this case prints one time and exits
//        }

        //show hello kool coders 3 times using for loop
        for(int i = 1; i <= 3; i++){
            System.out.println("Hello kool coders!!");
        }

    }
}
