package day4_scanner;

import java.util.Scanner;

public class SpeedCheckScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to speedCheck program");
        System.out.println("Enter your current speed: ");
        int currentSpeed = scan.nextInt();
        System.out.println("current speed: " + currentSpeed);
        int speedLimit = 55;

        int overTheLimit = currentSpeed - speedLimit;

        System.out.println("You are driving " + overTheLimit + " mph over the speed limit!");


    }
}
