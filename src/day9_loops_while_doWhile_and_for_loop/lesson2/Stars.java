package day9_loops_while_doWhile_and_for_loop.lesson2;

public class Stars {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            System.out.print("*");
        }

        String myStars = "";
        int starsCount = 50;
        for(int a = 1; a <= starsCount; a++){
            myStars += "*";
        }

        System.out.println(myStars);
        System.out.println(myStars.length() + " stars");


    }
}
