package day8_string_manipulation.lesson1;

public class StringContains {
    public static void main(String[] args) {
        String email = "student@gmail.com";
        System.out.println(email.contains("@")); // true
        System.out.println(email.contains("#")); // false
        System.out.println(email.contains("gmail")); // true
        System.out.println(email.contains("stunt")); // false

        boolean hasDotCom = email.contains(".com");
        System.out.println(hasDotCom);

        String list = "milk, eggs, bread, turkey, water, chocolate, potato, apple";

        if(list.contains("turkey")){
            System.out.println("Turkey is there!");
        }else{
            System.out.println("We forgot turkey");
        }

        if (list.contains("banana")){
            System.out.println("Banana is there!");
        }else{
            System.out.println("Lets add bananas!");
        }

        boolean hasMilk = list.contains("milk");
        System.out.println(hasMilk);

        if (hasMilk){
            System.out.println("We got the milk");
        }

        boolean hasWater = list.toUpperCase().contains("WATER");
        System.out.println("hasWater = " + hasWater);



    }
}
