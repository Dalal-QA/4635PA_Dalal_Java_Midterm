package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     *
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */
    static int factIt=1;
    static int result;
    static int x;
    static int y;

    //This method is returning me the factorial of any given number using iteration
    public static int getFactorialByIteration(int x){

        for(int i = 1; i<=x; i++){
           factIt=factIt*i;
        }
      return factIt;
    }

    //This method is returning me the factorial of any given number using Recursion

    public static int getFactorialByRecursion(int y){
        if(y==0 || y==1){
            return 1;
        }else{
            result = getFactorialByRecursion(y-1) *y;
            return result;

        }
    }
    public static void main(String[] args) {

        Factorial.getFactorialByIteration(7);
        System.out.println("The factorial of "+ x + " is: "+ factIt);

        Factorial.getFactorialByRecursion(8);
        System.out.println("The factorial of "+ y + " is:"+ result );


        }



}













