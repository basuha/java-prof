package alishev.regexp;

import java.util.Arrays;

public class SplitEx {
    public static void main(String[] args) {
        String a = "Hello2342World4233344Hey";
        System.out.println(Arrays.toString(a.split("\\d+")));
    }
}
