package string_problems;

import java.util.Locale;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */
    public static boolean isPalindrome(String str) {

        String reverse = "";

        boolean isItPalindrome = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // Checking the equality of the two string
        if (str.equals(reverse)) {
            isItPalindrome = true;
        }
        return isItPalindrome;
    }

    public static void main(String[] args) {


        String str1 = "MOM";
        boolean isPalindrome1 = isPalindrome(str1);
        System.out.println(str1 + " is a palindrome? " + isPalindrome1);

        String str2 = "DAD";
        boolean isPalindrome2 = isPalindrome(str2);
        System.out.println(str2 + " is a palindrome? " + isPalindrome2);

        String str3 = "MADAM";
        boolean isPalindrome3 = isPalindrome(str3);
        System.out.println(str3 + " is a palindrome? " + isPalindrome3);

        String str4 = "RACECAR";
        boolean isPalindrome4 = isPalindrome(str4);
        System.out.println(str4 + " is a palindrome? " + isPalindrome4);

    }




}
