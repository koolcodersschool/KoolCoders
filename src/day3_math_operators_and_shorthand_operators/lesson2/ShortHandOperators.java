package day3_math_operators_and_shorthand_operators.lesson2;

public class ShortHandOperators {
    public static void main(String[] args){
        int cars = 15;
        System.out.println("Cars in parking lot: " + cars);

        cars = cars + 2;
        System.out.println("Cars in parking lot: " + cars);

        cars += 3;
        System.out.println("Cars in parking lot: " + cars);

        cars = cars - 1;
        System.out.println("Cars in parking lot: " + cars);

        cars -= 2;
        System.out.println("Cars in parking lot: " + cars);

        cars *= 3;
        System.out.println("Cars in parking lot: " + cars);

        cars /= 2;
        System.out.println("Cars in parking lot: " + cars);

        int carsBack = 20;
        cars += carsBack;
        System.out.println("Cars in parking lot: " + cars);

        String letters = "A";
        System.out.println("Letters: " + letters);
        letters += "B";
        System.out.println("Letters: " + letters);

        letters += "CD";
        System.out.println("Letters: " + letters);

        int apples = 10;
        apples %= 3;
        System.out.println("Apples left: " + apples);

        System.out.println(apples / 0.0);
    }
}
