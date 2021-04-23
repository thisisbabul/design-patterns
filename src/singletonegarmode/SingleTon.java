package singletonegarmode;

public class SingleTon {
    private static SingleTon singleTon = new SingleTon();

    private SingleTon() {}

    public static SingleTon getInstance() {
        return singleTon;
    }

    public static void printObj(SingleTon singleTon) {
        System.out.println("Unique ID of the object " + System.identityHashCode(singleTon));
    }
}
