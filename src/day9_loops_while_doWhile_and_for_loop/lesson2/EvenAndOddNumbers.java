package day9_loops_while_doWhile_and_for_loop.lesson2;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

        for(int n = 1; n <=100; n++){
            if(n % 2 == 0){
                System.out.print(n + " ");

            }
        }
        System.out.println();
        for(int num = 1; num <= 100; num++){
            if(num % 2 != 0){
                System.out.print(num + " ");
            }
        }

    }
}
