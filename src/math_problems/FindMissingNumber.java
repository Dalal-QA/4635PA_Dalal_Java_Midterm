package math_problems;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */


    public static int findTheMissingNumber(int [] array){
        int x = array.length +1; //Since the array is missing one element
        int sumOfTheArray = 0;
        int expectedSum = (x * (x+1))/2;  //this is calculate the expected sum of the numbers from 1 to n (which is supposed to be 55)

        for (int num: array){
            sumOfTheArray += num;
        }
        int missingNumber = expectedSum - sumOfTheArray; //(55-46=9)  and 9 is the missing number
        return missingNumber;
    }
    public static void main(String[] args) {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
    int missingNumber= findTheMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }
}
