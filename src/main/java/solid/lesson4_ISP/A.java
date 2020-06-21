package solid.lesson4_ISP;

public class A {
    private I i;

    public A(I i) {
        this.i = i;
    }

    public void callGetName() {
        System.out.println(i.getName());
    }
}
