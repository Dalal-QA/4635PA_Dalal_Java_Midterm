package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    /** INSTRUCTIONS
     * Implement a solution to find the length of the longest word in the given sentence below
     * Your solution should return a map containing the length of the word as the key & the word itself as the value
     * "10: biological"
     */

    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        for(Map.Entry<Integer,String> entry : wordNLength.entrySet()){
            int length = entry.getKey();
            String word = entry.getValue();
            System.out.println("Largest word:" + word);
            System.out.println("Length:" + length);
        }


    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<>();
        String st = "";   //storing the largestword here
        int maxLength = 0;

        String [] words = wordGiven.trim().split("\\s+");
        //Iterate through the words to find the largest word
        for(String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                st = word;
            }
        }
        map.put(maxLength, st);


        return map;
    }
}
