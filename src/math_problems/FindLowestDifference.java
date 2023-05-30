package math_problems;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */


    public static int returnLowestNumber(int [] array1, int array2 []){
        int lowestNumber = 1; //this is the starting point to search for the lowest not shared  number
       while(true){
           boolean isItInArray1 = false;
           boolean isInArray2 =false;

           for(int x: array1){   //for each element in the array1 check if it's equal to the lowest number (1)
               if (x ==lowestNumber){
                   isItInArray1 = true;
                   break;
               }
           }
           for (int y: array2){   //for each element in the array2 check if it's equal to the lowest number(1)
               if(y == lowestNumber){
                   isInArray2 =true;
                   break;
               }

           }
           if(isItInArray1!= isInArray2){ //if the lowest in array1 is not equal to the lowest number in the array2 then return the lowest number
               return lowestNumber;
           }
           lowestNumber++;
       }
    }
    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

     int lowestNotSharedNumber =returnLowestNumber(array1,array2);
        System.out.println("the lowest number that is not shared bettween the 2 arrays is "+ lowestNotSharedNumber );

    }



}
