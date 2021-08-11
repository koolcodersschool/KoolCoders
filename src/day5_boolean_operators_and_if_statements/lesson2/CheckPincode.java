package day5_boolean_operators_and_if_statements.lesson2;

public class CheckPincode {
    public static void main(String[] args){
        int secretPincode = 2345;
        int inputPincode = 2345;

        if(inputPincode == secretPincode){
            System.out.println("Welcome to Your Account");
            System.out.println("You can withdraw, deposit, view balances");
        }else{
            System.out.println("Invalid pincode!");
            System.out.println("Access Denied!");
        }

        System.out.println("Thank you for your business! Bye");
    }
}
