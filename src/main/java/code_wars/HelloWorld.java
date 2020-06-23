package code_wars;

import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

public class HelloWorld {
    static String toCamelCase(String s){
        if (s.isEmpty())
            return s;
        String splitSymbol = s.contains("-") ? "-" : "_";
        String[] strings = s.split(splitSymbol);
        boolean capitalized = StringUtils.isAllUpperCase(s.substring(0,1));
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            sb.append(capitalized ? StringUtils.capitalize(string)
                    : (isFirst ? string : StringUtils.capitalize(string)));
            isFirst = false;
        }
        return sb.toString();
    }
}


class FindOdd {
    public static int findIt(int[] a) {
        Arrays.sort(a);

        int counter = 0;
        int odd = 0;
        int biggestNumber = a[a.length - 1];
        boolean isBiggerThanOne = a.length > 1;

        for (int i = 0; i < (isBiggerThanOne ? a.length - 1 : a.length); i++) {
            if (counter == 0) {
                counter++;
            }
            if (a[i] == a[isBiggerThanOne ? i + 1 : i] && isBiggerThanOne) {
                counter++;
            } else {
                if (counter % 2 != 0) {
                    odd = a[i];
                } else if (counter == biggestNumber) {
                    odd = a[i+1];
                }
                counter = 0;
            }
        }

        return odd;
    }
}

class XO {
    public static boolean getXO (String str) {
        return StringUtils.countMatches(str.toLowerCase(), "x")
                == StringUtils.countMatches(str.toLowerCase(), "o");
    }
}

