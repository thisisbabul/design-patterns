package abstractfactory;

import java.util.Scanner;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vehicleType = in.nextLine().toLowerCase();

        Factory factory = Factory.getFactory(vehicleType);

        Engine engine = factory.getEngine();
        engine.design();
        engine.manufacture();
        engine.test();

        Tyre tyre = factory.getTyre();
        tyre.design();
        tyre.manufacture();

        in.close();
    }
}
