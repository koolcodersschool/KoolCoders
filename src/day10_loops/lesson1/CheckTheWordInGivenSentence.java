package day10_loops.lesson1;

public class CheckTheWordInGivenSentence {
    public static void main(String[] args) {
        String str = "my cat your dog";
        int count = 0;
        for(int a = 0; a < str.length() - 2; a++){
            if(str.substring(a, a+3).equals("cat")){
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}
