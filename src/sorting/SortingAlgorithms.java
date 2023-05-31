package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAlgorithms {


    /**
     * INSTRUCTIONS
     * You must implement all of the sorting algorithms below. Feel free to add any helper methods that you may need,
     * but make sure they are private, as to not be accessed outside of this class.
     * <p>
     * You must also store the sorted arrays into their own individual database tables (Selection Sort should be stored
     * in table `selection_sort`, Insertion Sort should be stored in table `insertion_sort`)
     */

    long executionTime = 0;

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        // IMPLEMENT HERE

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] bubbleSort(int[] array) {

        int length = array.length;
        int temp;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
            return array;
        }



        public int[] mergeSort ( int[] array){


                    return array;
                }

        public int[] quickSort ( int[] array){
            quickSortHelper(array, 0, array.length - 1);
            return array;
        }

    private void quickSortHelper(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSortHelper(array, low, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



         public int[] heapSort ( int[] array){
             int n = array.length;

             // Build max heap
             for (int i = n / 2 - 1; i >= 0; i--) {
                 heapify(array, n, i);
             }

             // Extract elements from the heap in a sorted order
             for (int i = n - 1; i >= 0; i--) {
                 // Swap the root (maximum element) with the last element
                 int temp = array[0];
                 array[0] = array[i];
                 array[i] = temp;

                 // Heapify the reduced heap
                 heapify(array, i, 0);
             }

             return array;
         }

    private void heapify(int[] array, int n, int i) {
        int largest = i; // Initialize largest as the root
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        // If the left child is larger than the root
        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // If the right child is larger than the largest so far
        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // If the largest is not the root
        if (largest != i) {
            // Swap the largest element with the root
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }

    }

       public int[] bucketSort ( int[] array){

           if (array.length == 0)
               return array;

           // Find the maximum and minimum values in the array
           int minValue = array[0];
           int maxValue = array[0];
           for (int i = 1; i < array.length; i++) {
               if (array[i] < minValue)
                   minValue = array[i];
               else if (array[i] > maxValue)
                   maxValue = array[i];
           }

           // Calculate the number of buckets
           int numBuckets = (maxValue - minValue) / array.length + 1;
           ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(numBuckets);
           for (int i = 0; i < numBuckets; i++) {
               buckets.add(new ArrayList<>());
           }

           // Assign each element to its corresponding bucket
           for (int i = 0; i < array.length; i++) {
               int bucketIndex = (array[i] - minValue) / array.length;
               buckets.get(bucketIndex).add(array[i]);
           }

           // Sort each bucket and concatenate the sorted buckets
           int currentIndex = 0;
           for (int i = 0; i < numBuckets; i++) {
               ArrayList<Integer> bucket = buckets.get(i);
               Collections.sort(bucket);
               for (int j = 0; j < bucket.size(); j++) {
                   array[currentIndex] = bucket.get(j);
                   currentIndex++;
               }
           }

           return array;
    }

          public int[] shellSort ( int[] array){

                    int n = array.length;
                    int gap = n / 2;

                    while (gap > 0) {
                        for (int i = gap; i < n; i++) {
                            int temp = array[i];
                            int j = i;

                            while (j >= gap && array[j - gap] > temp) {
                                array[j] = array[j - gap];
                                j -= gap;
                            }

                            array[j] = temp;
                        }

                        gap /= 2;
                    }

                    return array;
                }
            }


