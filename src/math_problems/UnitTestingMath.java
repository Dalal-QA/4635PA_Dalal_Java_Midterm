package math_problems;

public class UnitTestingMath {

    /**
     * Use this class to unit test all of the class within this package
     */

    public static void main(String[] args) {

        System.out.println(Factorial.getFactorialByRecursion(25));
        System.out.println(Factorial.getFactorialByIteration(8));
        System.out.println(Fibonacci.printFibonacciNumber(3));

        System.out.println("The lowest number not shared of those two arrays is: ");
        int [] arrayA={1,5,8,5,7,6,9};
        int [] arrayB={2,5,10,11,4,15};
        System.out.println(FindLowestDifference.returnLowestNumber(arrayA,arrayB));

        System.out.println("The missing number in this array is: ");
        int[] arrayC= new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missingNumber = FindMissingNumber.findTheMissingNumber(arrayC);
        System.out.println(missingNumber);

        System.out.println("The lowest number in this array is: ");
        int[] arrayD= new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6,0,13,14,87,-1};
        System.out.println(LowestNumber.lowestNumber(arrayD));


        int range = 1000;
        System.out.println("Prime numbers from 2 to " + range + " are:");
        PrimeNumber.printListOfPrimeNumber(range);
    }
}
