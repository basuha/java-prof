package alishev.regexp;

public class Test {
    public static void main(String[] args) {
        /*
            \\ - обозначение спец символа

            \\d - одна цифра
            \\w - одна буква == [a-zA-Z]

            + - 1 или более
            * - 0 или более
            ? - 0 или 1 символ

            [abc] - конструкция ИЛИ
            (a|b|c) - конструкция ИЛИ

            [a-zA-Z] - все буквы
            [0-9] == \\d
            [^abc] - кроме abc

            . - любой символ

            {2}    (\\d{2})   - две цифры              |
            {2,}   (\\d{2,})  - две или более цифры    |-> точное количество предыдущих символов
            {2, 4} (\\d{2,4}) - от двух до четырех цифр|
         */
        String a = "-34524634623466433455";
        String b = "34524634623466433455";
        String c = "+34524634623466433455";

        String regex = "(-|\\+)?\\d+";
        System.out.println(a.matches(regex));
        System.out.println(b.matches(regex));
        System.out.println(c.matches(regex));

        //*************************************************

        System.out.println();

        String d1 = "dqweqESADf234234";
        String d2 = "G234234";
        String d3 = "234234";
        String regex2 = "[^a-z]+\\d+";
        System.out.println(d1.matches(regex2));
        System.out.println(d2.matches(regex2));
        System.out.println(d3.matches(regex2));

        //*********************************************

        System.out.println();

        System.out.println(UrlValidator.isValid("http://www.wawr.ru"));
        System.out.println(UrlValidator.isValid("www.wawr.ru"));
        System.out.println(UrlValidator.isValid("wawr.com"));
        System.out.println(UrlValidator.isValid("wawr.kz"));
        System.out.println(UrlValidator.isValid("http://www.wawr.kz"));

        //*********************************************

        System.out.println();

        String f = "1223523";
        System.out.println(f.matches("\\d{3,}"));
    }
}

class UrlValidator {
    private static final String VALID_URL_REGEX = "(http(s)?://www\\.)?.+\\.(com|ru)";

    public static boolean isValid(String url) {
        return url.matches(VALID_URL_REGEX);
    }
}