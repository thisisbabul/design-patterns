package factorymethod;

public class Truck implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designing Truck");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Truck");
    }
}
