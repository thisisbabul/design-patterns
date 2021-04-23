package singletonlazymode;

public class SingleTon {
    private static SingleTon singleTon = null;

    private SingleTon() {}

    public static SingleTon getInstance() {
        synchronized (SingleTon.class) {
            if (singleTon == null) {
                singleTon = new SingleTon();
            }
            return singleTon;
        }
    }

    public static void printObj(SingleTon singleTon) {
        System.out.println("Unique ID of the object " + System.identityHashCode(singleTon));
    }
}
