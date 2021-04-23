package singletonegarmode;

public class SingleTonClient {
    public static void main(String[] args) {
        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();

        SingleTon.printObj(singleTon1);
        SingleTon.printObj(singleTon2);
    }
}
