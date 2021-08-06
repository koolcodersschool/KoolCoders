package day2_intro_to_variables;

public class CellPhone {
    public static void main(String[] args){
        String brand = "iPhone";
        int storageSize = 256;
        double price = 499.99;
        String color = "silver";
        int screenSize = 10;

        System.out.println(brand);
        System.out.println(storageSize);
        System.out.println(price);
        System.out.println(color);
        System.out.println(screenSize);

        // Different way doing the same thing
        System.out.println();
        System.out.println(brand + "\n" + storageSize + "\n" + price + "\n" + color + "\n" + screenSize);
    }
}
