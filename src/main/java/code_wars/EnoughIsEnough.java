package code_wars;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Task
 Given a list lst and a number N, create a new list that contains each
 number of lst at most N times without reordering. For example if N = 2,
 and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next
 [1,2] since this would lead to 1 and 2 being in the result 3 times, and
 then take 3, which leads to [1,2,3,1,2,3].
 Example
 EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
 EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
 */
public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> list = new ArrayList<>();
        for(int num: elements)
            list.add(num);
        for(Integer num: list)
            System.out.println(Collections.frequency(list, num));
        return null;
    }

}

/**
 * @author Marko Bekhta
 */
class EnoughIsEnoughTest {
    public static void main(String[] args){
        deleteNth();
    }
    @Test
    public static void deleteNth() {
        assertArrayEquals(
                new int[] { 20, 37, 21 },
                EnoughIsEnough.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
                EnoughIsEnough.deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )

        );
        assertArrayEquals(
                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
                EnoughIsEnough.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 1, 1, 1 },
                EnoughIsEnough.deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
        );
        assertArrayEquals(
                new int[] { },
                EnoughIsEnough.deleteNth( new int[] { }, 5 )
        );

    }

}