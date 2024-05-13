package SquareNSum;

/*
Complete the square sum function so that it squares each number passed into it
and then sums the results together.


 */
public class Main {
    public static void main(String[] args) {

        System.out.println(squareSum(new int[] {1,2}));
        System.out.println(squareSum(new int[] {5,-3,4}));
        System.out.println(squareSum(new int[] {}));
    }

    public static int squareSum(int[] n){

        if(n == null){return 0;}

        int sum=0;
        for (int j : n) {
            sum += j * j;
        }

        return sum;
    }
}
