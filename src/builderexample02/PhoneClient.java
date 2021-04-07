package builderexample02;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("Android").setRam(8).setBattery(6000).getPhone();
        System.out.println(phone);
    }
}
