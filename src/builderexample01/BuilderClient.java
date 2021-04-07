package builderexample01;

public class BuilderClient {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        HouseBuildDirector carBuilderDirector = new HouseBuildDirector(builder);
        System.out.println(carBuilderDirector.construct());

        builder = new WoodenHouseBuilder();
        carBuilderDirector = new HouseBuildDirector(builder);
        System.out.println(carBuilderDirector.construct());
    }
}
