package day6_multi_branch_if_statements_and_nested_if_statement.lesson2;

public class Cafe {
    public static void main(String[] args) {
        String drink, food, order;
        double drinkPrice = 0.0, foodPrice = 0.0;

        order = "food";
        drink = "";
        food = "pizza";

        // ########################## 1st version ################################

        if(order.equals("drink")) {
            if (drink.equals("soda")) {
                drinkPrice = 1.99;
            } else if (drink.equals("coffee")) {
                drinkPrice = 4.99;
            } else if (drink.equals("water")) {
                drinkPrice = 1.55;
            }else{
                System.out.println("Sorry, no such item available!");
            }


        }else if(order.equals("food")){
            if(food.equals("sandwich")){
                foodPrice = 7.45;
            }else if(food.equals("soup")){
                foodPrice = 6.33;
            }else if(food.equals("salad")){
                foodPrice = 9.99;
            }else{
                System.out.println("Sorry, no such item available!");
            }

        }

        System.out.println("Total price: " + (drinkPrice + foodPrice) );

        // ########################## 2nd version ################################


        if(order.equals("drink") && drink.equals("soda")){
            drinkPrice = 1.99;
        }else if(order.equals("drink") && drink.equals("coffee")){
            drinkPrice = 4.99;
        }else if(order.equals("drink") && drink.equals("water")){
            drinkPrice = 1.55;
        }else if(order.equals("food") && food.equals("sandwich")){
            foodPrice = 7.45;
        }else if(order.equals("food") && food.equals("soup")){
            foodPrice = 6.33;
        }else if(order.equals("food") && food.equals("salad")){
            foodPrice = 9.99;
        }else{
            System.out.println("Sorry, no such item available!");
        }

        System.out.println("Total price: " + (drinkPrice + foodPrice));


    }
}
