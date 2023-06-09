package sorting;

import java.util.List;
import java.util.Random;

import databases.SharedStepsDatabase;

    /** INSTRUCTIONS
     * Demonstrate all the different kind of sorting algorithms from the Sorting class. There is an example provided
     *  below to get you started.
     *
     *  You must store all the sorted arrays into their own database table, and retrieve the values and print them
     *  Display the execution time for each sorting - Example below.
     *
     *  You may use any database, such as MongoDB, Oracle MySql, PostgreSQL, etc, to store data and retrieve data.
     *
     *  BONUS: Come to a conclusion about which sorting algorithm is the most efficient, given data sets with a size of:
     *         10
     *         100
     *         1000
     *         10000
     *         100000
     */

public class SortEfficiency {

    public static void main(String[] args) throws Exception {
        // Declare and initialize an array of a desired length with random numbers (Try this with 100, 1000, 10000, 100000)
        int[] numberArray = new int[100];
        insertRandomNumbersIntoArray(numberArray);

        SortingAlgorithms sort = new SortingAlgorithms();
        SharedStepsDatabase ssdb = new SharedStepsDatabase();

        // region Selection Sort
        numberArray = sort.selectionSort(numberArray);
        long selectionSortExecutionTime = sort.executionTime;

        System.out.println("***SELECTION SORT***\nArray Length: " + numberArray.length + "\nExecution Time: "
                + selectionSortExecutionTime + " milliseconds");

        // Insert sorted array into a database table, with the desired table name and column name
        ssdb.insertIntegerArray("selection_sort", "sorted_numbers", numberArray);

        // Retrieve all elements from the newly created table
        String query = "SELECT * FROM SELECTION_SORT";
        List<String> sorted_numbers = ssdb.executeQueryReadAllSingleColumn(query, "sorted_numbers");
        printValue(sorted_numbers);

        // endregion

        // You must randomize the number array after each sorting algorithm to prepare it for the next sorting algorithm
        randomize(numberArray);

        // region Insertion Sort
        numberArray = sort.insertionSort(numberArray);
        long insertionSortExecutionTime = sort.executionTime;

        System.out.println("Total Execution Time of " + numberArray.length + " numbers in Insertion Sort took: "
                + insertionSortExecutionTime + " milliseconds");

        // endregion

        randomize(numberArray);

        // region Bubble Sort
        numberArray= sort.bubbleSort(numberArray);
        long bubbleSortExecutionTime = sort.executionTime;
        System.out.println("Total Execution Time of " + numberArray.length + " numbers in bubble Sort took: "
                + bubbleSortExecutionTime + " milliseconds");

        // endregion

        randomize(numberArray);

        // region Merge Sort
        numberArray= sort.mergeSort(numberArray);
        long mergeSortExecutionTime = sort.executionTime;
        System.out.println("Total Execution Time of " + numberArray.length + " numbers in merge Sort took: "
                + mergeSortExecutionTime + " milliseconds");



        // endregion

        randomize(numberArray);

        // region Quick Sort
        numberArray= sort.quickSort(numberArray);
        long quickSortExecutionTime = sort.executionTime;
        System.out.println("Total Execution Time of " + numberArray.length + " numbers in quick Sort took: "
                + quickSortExecutionTime + " milliseconds");


        // endregion

        randomize(numberArray);

        // region Heap Sort
        numberArray= sort.heapSort(numberArray);
        long heapSortExecutionTime = sort.executionTime;
        System.out.println("Total Execution Time of " + numberArray.length + " numbers in heap Sort took: "
                + heapSortExecutionTime + " milliseconds");

        // endregion

        randomize(numberArray);

        // region Bucket Sort
        numberArray= sort.bucketSort(numberArray);
        long bucketSortExecutionTime = sort.executionTime;
        System.out.println("Total Execution Time of " + numberArray.length + " numbers in bucket Sort took: "
                + bucketSortExecutionTime + " milliseconds");


        // endregion

        randomize(numberArray);

        // region Shell Sort
        numberArray= sort.shellSort(numberArray);
        long shellSortExecutionTime = sort.executionTime;
        System.out.println("Total Execution Time of " + numberArray.length + " numbers in shell Sort took: "
                + shellSortExecutionTime + " milliseconds");

        // endregion
    }

    // region Helper Methods
    /**
     * Inserts random integers into an int[] array. All numbers have an upper bound of 1,000,000
     *
     * @param array Array to insert numbers into
     */
    private static void insertRandomNumbersIntoArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000000);
        }
    }

    /**
     * Randomizes the numbers in an int[] array
     *
     * @param array The array to be randomized
     */
    private static void randomize(int[] array) {
        Random r = new Random();
        int n = array.length;

        /*
         Start from the last element and swap one by one. We don't
         need to run for the first element that's why i > 0
         */
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    /**
     * Prints all values in a List<String>
     *
     * @param list List containing the values to be printed
     */
    private static void printValue(List<String> list) {
        for (String st : list) {
            System.out.println(st);
        }
    }

    // endregion
}
