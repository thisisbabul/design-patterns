package factorymethod;

public class MotorCycle implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designing MotorCycle");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing MotorCycle");
    }
}
