package day10_loops.lesson1;

public class SpeedLimit {
    public static void main(String[] args) {
        for(int speed = 10; speed <= 100; speed++){
            if (speed < 55){
                System.out.println(speed + " - accelerate");
            }else if(speed >= 55 && speed <= 60){
                System.out.println(speed + " - keep the speed");
            }else if(speed > 60){
                System.out.println(speed + " - slow down");
            }
        }
    }
}
