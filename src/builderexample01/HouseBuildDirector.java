package builderexample01;

public class HouseBuildDirector {
    private HouseBuilder builder;

    public HouseBuildDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House construct() {
        return builder.buildFloor().buildWall().buildRoof().build();
    }
}
