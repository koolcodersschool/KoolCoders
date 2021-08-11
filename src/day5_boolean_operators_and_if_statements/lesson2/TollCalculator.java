package day5_boolean_operators_and_if_statements.lesson2;

public class TollCalculator {
    public static void main(String[] args){
        String vehicleType = "truck";
        boolean isRushHour = true;
        double tollPrice = 0.0;

        // "car" and no rush hour totalPrice = 3.0
        // "car" and rush hour totalPrice = 7.5
        // "truck" and no rush hour totalPrice = 4.5
        // "truck" and rush hour totlPrice = 11.5

        if(vehicleType.equalsIgnoreCase("car") && isRushHour == true){
            tollPrice = 7.5;
            System.out.println("Vehicle type: car. Rush hour.");
        }else if(vehicleType.equalsIgnoreCase("car") && isRushHour == false){
            tollPrice = 3.0;
            System.out.println("Vehicle type: car. Not rush hour.");
        }else if(vehicleType.equalsIgnoreCase("truck") && isRushHour == true){
            tollPrice = 11.50;
            System.out.println("Vehicle type: truck. Rush hour.");
        }else if(vehicleType.equalsIgnoreCase("truck") && isRushHour == false){
            tollPrice = 4.5;
            System.out.println("Vehicle type: truck. Not rush hour.");
        }else{
            System.out.println("Vehicle not recognize use a different route");
        }

        System.out.println("Toll cost: $" + tollPrice);


    }
}
