package solid.lesson4_ISP;

public class B {
    private I2 i;

    public B(I2 i2) {
        this.i = i2;
    }

    public void callGetDate() {
        i.getDate();
    }
}
