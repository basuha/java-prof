package code_warriors;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
 *
 * For example:
 *
 *  persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 *                       // and 4 has only one digit
 *
 *  persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 *                        // 1*2*6 = 12, and finally 1*2 = 2
 *
 *  persistence(4) == 0 // because 4 is already a one-digit number
 */

class Persist {
    public static int persistence(long n) {
        int mulCount = 0;
        return function(longToIntArray(n), mulCount);
    }

    private static int function(int[] array, int mulCount) {
        int temp = array[0];
        if (array.length == 1)
            return mulCount;
        for (int i = 1; i < array.length; i++)
            temp *= array[i];
        mulCount++;
        return function(longToIntArray(temp), mulCount);
    }

    private static int[] longToIntArray (long n) {
        String temp = String.valueOf(n);
        int[] out = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            out[i] = temp.charAt(i) - '0';
        }
        return out;
    }
}

class PersistTest {
    public static void main(String[] args) {
        System.out.println(Persist.persistence(99999));
        BasicTests();
    }
    @Test
    public static void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }
}