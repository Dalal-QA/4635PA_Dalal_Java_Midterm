package string_problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */


    public static Set<String> doPermutation(String st){

        // store the permutation in a set to avoid duplication
        Set<String> permutation =new HashSet<String>();
        if(st == null || st.length()==0){
            permutation.add("");
            return permutation;
        }
        char first = st.charAt(0);
        String sub =st.substring(1);

        Set<String> words = doPermutation(sub);
        for(String newSt : words){
            for(int i = 0; i<=newSt.length(); i++){
                permutation.add(newSt.substring(0,i) + first + newSt.substring(i));
            }
        }
        return permutation;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter your String");
        String word = input.nextLine();
        System.out.println("The permutation of " + word + doPermutation(word) );

    }

}
