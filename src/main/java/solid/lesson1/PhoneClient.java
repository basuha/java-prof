package solid.lesson1;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone samsungS2 = new Phone();
        samsungS2.dial("0980234");
        samsungS2.send("asdfa1");
        samsungS2.receive();
        samsungS2.disconnect();
    }
}
