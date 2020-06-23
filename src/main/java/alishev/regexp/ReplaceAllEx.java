package alishev.regexp;

public class ReplaceAllEx {
    public static void main(String[] args) {
        String a = "Hello           there hey";
        System.out.println(a.replaceAll(" +", "."));


        String b = "Hello45435there5435hey";
        System.out.println(b.replaceAll("\\d+", "w"));
        System.out.println(b.replaceFirst("\\d+", "w"));
    }
}
