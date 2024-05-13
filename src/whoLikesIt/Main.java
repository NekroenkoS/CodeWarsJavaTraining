package whoLikesIt;

/*
Implement the function which takes an array containing the names of people that like an item.
It must return the display text as shown in the examples:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

 */

public class Main {

    public static void main(String[] args) {

        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));

    }

    public static String whoLikesIt(String... names) {

        int numOfPeople = names.length;

        switch (numOfPeople) {

            case 0:
                return "no one likes this";

            case 1:
                return names[0] + " likes this";

            case 2:
                return names[0] + " and " + names[1] + " like this";

            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";

            default:
                return names[0] + ", " + names[1] + " and " + (numOfPeople-2) + " others like this";
        }
    }
}
