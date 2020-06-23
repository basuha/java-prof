package code_wars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


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
        if (Character.isUpperCase(array[0]))
            alphabet = alphabet.toUpperCase();

        for (int i = alphabet.indexOf(array[0]), j = 0; i < i + array.length; i++, j++)
            if (alphabet.charAt(i) != array[j])
                return alphabet.charAt(i);

        return (char) -1;
    }
}

class SolutionTest {
    public static void main(String[] args) {
//        System.out.println(Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
//        System.out.println(Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
        exampleTests();
    }
    @Test
    public static void exampleTests() {
        assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}