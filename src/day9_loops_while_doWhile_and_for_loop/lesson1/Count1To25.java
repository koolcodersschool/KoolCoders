package day9_loops_while_doWhile_and_for_loop.lesson1;

public class Count1To25 {
    public static void main(String[] args) throws Exception {

        int num = 1;
        while(num <= 25){
            System.out.print(num + " ");
            num++;
            Thread.sleep(500);
        }

        System.out.println();

        int num1 = 25;
        while(num1 >= 1){
            System.out.print(num1 + " ");
            num1--;
        }


    }
}
