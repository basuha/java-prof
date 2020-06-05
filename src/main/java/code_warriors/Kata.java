package code_warriors;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
 *
 * You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 *
 * Example:
 *
 * ['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'
 *
 * ["a","b","c","d","f"] -> "e"
 * ["O","Q","R","S"] -> "P"
 * (Use the English alphabet with 26 letters!)
 */
public class Kata {
    public static char findMissingLetter(char[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String input = Arrays.toString(array);
        for (int i = alphabet.indexOf(input.charAt(0)), j = 0; i < i + array.length; i++, j++) {
//            System.out.println(i);
            if (alphabet.charAt(i) != array[j])
                return alphabet.charAt(i);
        }
        return 13;
    }
}

class SolutionTest {
    public static void main(String[] args) {
//        System.out.println(Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        exampleTests();
    }
    @Test
    public static void exampleTests() {
        assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}