package day3_math_operators_and_shorthand_operators.lesson1;

public class DoingMath {
    public static void main(String[] args){
        System.out.println(5 + 7);
        System.out.println(100 - 45);
        System.out.println(40 * 48);
        System.out.println(500 / 4);

        int chairs = 100 + 5;
        System.out.println("Chairs: " + chairs);

        int tables = chairs - 10;
        System.out.println("Tables: " + tables);

        int a = 4;
        int b = 5;
        int c = a * b;
        System.out.println("C value: " + c);

        int slices = 8;
        int friends = 4;
        int slicePerFriend = slices / friends;
        System.out.println("Slice per Friend is: " + slicePerFriend);

        System.out.println(10 / 3);
        System.out.println(10.0 / 3.0);

        System.out.println(5 + 2 * 3);
        System.out.println((5 + 2) * 3);

    }
}
