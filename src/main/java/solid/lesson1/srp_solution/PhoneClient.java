package solid.lesson1.srp_solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImpl(), new DataManagerImpl());

        phone.dial("234565");
        phone.send("sadsd");
        phone.receive();
        phone.disconnect();
    }
}
