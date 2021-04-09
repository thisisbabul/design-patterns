package factorymethod;

public class Car implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designing Car");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Car");
    }
}
