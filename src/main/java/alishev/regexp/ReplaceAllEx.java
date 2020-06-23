package alishev.regexp;

public class ReplaceAllEx {
    public static void main(String[] args) {
        String a = "Hello           there hey";
        System.out.println(a.replaceAll(" +", "."));
    }
}
