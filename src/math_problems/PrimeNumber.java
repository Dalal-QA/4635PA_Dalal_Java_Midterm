package math_problems;

public class PrimeNumber {

    /**
     * INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     * Print out the prime numbers in the given range.
     * <p>
     * BONUS: Figure out how to improve algorithmic efficiency
     */
    public static void printListOfPrimeNumber(int range) {
        boolean[] isPrime = new boolean[range + 1];  //It first initializes a boolean array, isPrime, where each index represents a number. Initially, all numbers are assumed to be prime.

        for (int i = 2; i <= range; i++) {  //The algorithm iterates from 2 to the square root of the range. For each prime number found, it marks all its multiples as non-prime by setting their corresponding indexes in the isPrime array to false.
            isPrime[i] = true;

        }
        for (int i = 2; i * i <= range; i++) {  //Finally, it loops through the isPrime array and prints the numbers that are marked as prime.
            if (isPrime[i]) {
                for (int j = i * i; j <= range; j += i) {
                    isPrime[j] = false;
                }
            }

        }
        for (int i = 2; i <= range; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }

        public static void main (String[]args){
            int range = 1000000;
            System.out.println("Prime numbers from 2 to " + range + " are:");
            printListOfPrimeNumber(range);
        }

    }

