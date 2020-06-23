package code_wars;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.stream.*;


/**
 * Write a function that, given a string of text (possibly with punctuation and line-breaks), returns an array of the top-3 most occurring words, in descending order of the number of occurrences.
 *
 * Assumptions:
 * A word is a string of letters (A to Z) optionally containing one or more apostrophes (') in ASCII. (No need to handle fancy punctuation.)
 * Matches should be case-insensitive, and the words in the result should be lowercased.
 * Ties may be broken arbitrarily.
 * If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned, or an empty array if a text contains no words.
 * Examples:
 * top_3_words("In a village of La Mancha, the name of which I have no desire to call to
 * mind, there lived not long since one of those gentlemen that keep a lance
 * in the lance-rack, an old buckler, a lean hack, and a greyhound for
 * coursing. An olla of rather more beef than mutton, a salad on most
 * nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
 * on Sundays, made away with three-quarters of his income.")
 * # => ["a", "of", "on"]
 *
 * top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e")
 * # => ["e", "ddd", "aa"]
 *
 * top_3_words("  //wont won't won't")
 * # => ["won't", "wont"]
 * For java users, the calls will actually be in the form: TopWords.top3(String s), expecting you to return a List<String>.
 *
 * Bonus points (not really, but just for fun):
 * Avoid creating an array whose memory footprint is roughly as big as the input text.
 * Avoid sorting the entire array of unique words.
 */
public class TopWords {

    public static List<String> top3(String s) {
        String[] text = s.toLowerCase().split(" ");
        for (int i = 0; i < text.length; i++)
            if (text[i].matches("[\\W]")) {
                text[i] = "";
            } else {
                text[i] = text[i].replaceAll("[:,./]", "");
            }

        List<String> words = new ArrayList<>(Arrays.asList(text));
        Map<Integer,String> map = new HashMap<>();
        for (String word: words)
            if (!word.isEmpty())
                map.put(Collections.frequency(words, word), word);
        List<String> topWords = new ArrayList<>(map.values());
        Collections.reverse(topWords);
        List<String> top3 = new ArrayList<>();
        for (int i = 0; i < topWords.size() && i < 3; i++) {
            top3.add(topWords.get(i));
        }
        return top3;
    }
}

class SolutionTest2 {
    public static void main(String[] args) {
        System.out.println(TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
        System.out.println(TopWords.top3("  //wont won't won't "));
        System.out.println(TopWords.top3("  , e   .. "));
        sampleTests();
    }

    @Test
    public static void sampleTests() {
        assertEquals(Arrays.asList("e", "d", "a"),    TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
        assertEquals(Arrays.asList("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
        assertEquals(Arrays.asList("won't", "wont"),  TopWords.top3("  //wont won't won't "));
        assertEquals(Arrays.asList("e"),              TopWords.top3("  , e   .. "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  ...  "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  '  "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  '''  "));
        assertEquals(Arrays.asList("a", "of", "on"),  TopWords.top3(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n")) ));
    }
}