package code_warriors;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 *
 * Notes:
 *
 * Only lower case letters will be used (a-z). No punctuation or digits will be included.
 * Performance needs to be considered
 * Input strings s1 and s2 are null terminated.
 * Examples
 * scramble('rkqodlw', 'world') ==> True
 * scramble('cedewaraaossoqqyt', 'codewars') ==> True
 * scramble('katas', 'steak') ==> False
 */

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        List<Character> chars = str1.chars()
                .mapToObj(e->(char)e).collect(Collectors.toList());
        List<Character> word = str2.chars()
                .mapToObj(e->(char)e).collect(Collectors.toList());

        for (Character c : word) {
            if (!chars.contains(c))
                return false;
            chars.remove(c);
        }
        return true;
    }
}

class ScrambliesTest {

    public static void main(String[] args) {
        test();
    }

    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public static void test() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("rkqodlw","world"), true);
        testing(Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
        testing(Scramblies.scramble("katas","steak"),false);
        testing(Scramblies.scramble("scriptjavx","javascript"),false);
        testing(Scramblies.scramble("scriptingjava","javascript"),true);
        testing(Scramblies.scramble("scriptsjava","javascripts"),true);
        testing(Scramblies.scramble("javscripts","javascript"),false);
        testing(Scramblies.scramble("aabbcamaomsccdd","commas"),true);
        testing(Scramblies.scramble("commas","commas"),true);
        testing(Scramblies.scramble("sammoc","commas"),true);
    }
}
