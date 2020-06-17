package code_warriors;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.security.DigestInputStream;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Dubstep {

    public static String SongDecoder (String song)
    {
        List<Character> chars = song.replaceAll("WUB", " ").trim().chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toList());
        Iterator<Character> iterator = chars.iterator();

        for (int i = 0, count = 0; iterator.hasNext(); i++) {
            char c = iterator.next();
            if (c == ' ') {
                count++;
                if (count > 1) {
                    chars.remove(i);
                }
            }
        }

        return StringUtils.join(chars,"");
    }
}

class SongTests {
    public static void main(String[] args) {
        Test1();
        Test2();
    }
    @Test
    public static void Test1() {
        assertEquals("ABC", Dubstep.SongDecoder("WUBWUBABCWUB"));
    }

    @Test
    public static void Test2()
    {
        assertEquals("R L", Dubstep.SongDecoder("RWUBWUBWUBLWUB"));
    }
}