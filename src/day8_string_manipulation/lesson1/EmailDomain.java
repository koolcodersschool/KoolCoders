package day8_string_manipulation.lesson1;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "employee@icloud.com";

        if(email.contains("@gmail")){
            System.out.println("Google account");
        }else if(email.contains("@yahoo")){
            System.out.println("Yahoo account");
        }else if(email.contains("@hotmail")){
            System.out.println("Hotmail acoount");
        }else if(email.contains("@icloud")){
            System.out.println("Apple account");
        }else{
            System.out.println("Some other account");
        }




    }
}
