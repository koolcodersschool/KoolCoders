package day4_scanner.lesson1;

public class AgeCalculator {
    public static void main(String[] args){
        String name = "Adam Smith";
        int yearOfBirth = 1999;
        int currentYear = 2019;
        int age = currentYear - yearOfBirth;


        System.out.println(name + " is " + age + " years old");
    }
}
