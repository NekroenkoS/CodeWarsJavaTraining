package createPhoneNumber;

/*
Write a function that accepts an array of 10 integers (between 0 and 9),
that returns a string of those numbers in the form of a phone number.

Example
createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {

        String str = "(";
        for(int i=0;i<numbers.length;i++){

            if (i==3){ str+=") ";}
            if (i==6){str +="-";}
            str += numbers[i];
        }
        return str;
    }

}
