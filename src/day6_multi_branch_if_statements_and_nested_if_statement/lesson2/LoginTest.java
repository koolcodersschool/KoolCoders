package day6_multi_branch_if_statements_and_nested_if_statement.lesson2;

public class LoginTest {
    public static void main(String[] args) {
        String username = "koolcoders";
        String password = "abc123";

        if(username.equalsIgnoreCase("koolcoders") && password.equals("abc123")){
            System.out.println("Login Succesfull. Welcome");
        }else if(!username.equalsIgnoreCase("koolcoders") && password.equals("abc123")){
            System.out.println("Invalid username. Try again");
        }else if(username.equalsIgnoreCase("koolcoders") && !password.equals("abc123")){
            System.out.println("Invalid password. Try again");
        }else if (!username.equalsIgnoreCase("koolcoders") && !password.equals("abc123")){
            System.out.println("Invalid userrname and password");
        }

    }
}
