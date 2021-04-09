package factorymethod;

import java.util.Scanner;

public class FactoryMethodClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vehicleType = in.nextLine().toLowerCase();

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle(vehicleType);
        vehicle.design();
        vehicle.manufacture();
    }
}
