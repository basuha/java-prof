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
        return song.replaceAll("(WUB)+", " ").trim();
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