package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/
static void printFibonacciNumber(int f){
    int num1=0;
    int num2=1;
    System.out.println(num1 + "\n" + num2); //here am printing the two Fibonacci number 0and 1
    for (int i=3; i<=f;i++){
        int nextNum = num1+num2;
        System.out.println(nextNum + " ");
        num1 = num2;
        num2=nextNum;
    }

}
    public static void main(String[] args) {
         int f=40;
        System.out.println("Here are the  " + f + " Fibonacci numbers :");
        printFibonacciNumber(f);
    }
}
