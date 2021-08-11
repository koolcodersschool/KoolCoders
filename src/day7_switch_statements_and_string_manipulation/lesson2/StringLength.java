package day7_switch_statements_and_string_manipulation.lesson2;

public class StringLength {
    public static void main(String[] args) {

        String name = "And rea";
        System.out.println(name.length());

        int len = name.length();
        System.out.println("len = " + len);


        String school = "kool coders";

        System.out.println(school.length());

        int count = school.length();
        System.out.println(school+ " is " + count + " characters");

        String firstName = "Nijat";
        String lastName = "Mehdiyev";

        int countTotal = firstName.length() + lastName.length();
        System.out.println("countTotal = " + countTotal);

        String password = "koolcodersabcdfghijkl123";
        if(password.length() >= 8){
            System.out.println("Password length is matches requirement");
        }else{
            System.out.println("Password is too short. Needs to be minimum 8 character");
        }

        int passwordLength = password.length();
        if (passwordLength >= 8 && passwordLength <= 16){
            System.out.println("Password length is matches requirement");
        }else{
            System.out.println("Password is not meets requirement. Its too short or too long");
        }

    }
}
