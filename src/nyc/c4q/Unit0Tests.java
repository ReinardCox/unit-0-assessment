package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main(String args[]) {
        // Use main to test your methods
        printHelloWorld();
        System.out.println(returnPrimitiveBooleanTrue());
        System.out.println(returnPrimitiveInt1729());
        System.out.println(returnPrimitiveDoubleThreePointOneFour());
        System.out.println(returnPrimitiveCharZ());
        printSumOf1Upto10UsingForLoop();
        printSumOf1Upto10000UsingForLoop();
        System.out.println(isOdd(3));
        System.out.println(isMultipleOfThree(15));
        System.out.println(isOddAndIsMultipleOfThree(3));
        System.out.println(repeatStringXTimes("Shadow", 1));
        System.out.println(returnStringUntilQ("ubiquitous"));

        Person Alan = new Person();
        Alan.setCity("London");
        Alan.setName("Alan");

        System.out.println(isFromLondon(Alan));

    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
        return true;
    }

    public static int returnPrimitiveInt1729() {
        return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
        return 3.14;
    }

    public static char returnPrimitiveCharZ() {
        return 'Z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;

        for (int i = 1; i < 10; i++) {
            sum++;
        }
        System.out.println(sum);
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int sum = 0;

        for (int i = 1; i <= 10000; i++) {
            sum++;
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int n) {

        return n % 2 == 1;
    }

    public static boolean isMultipleOfThree(int n) {

        return n % 3 == 0;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        if (n % 2 == 1) {
            if (n % 3 == 0) {
                return true;
            }
        }
        return false;
    }

    public static String repeatStringXTimes(String input, int times) {

        if (times >= 1) {
            for (int i = 1; i < times; i++) {
                input += input;
            }
            return input;
        }

        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        return "blank";
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".

        String nString = "";

        for (int i = 0; i <= input.length(); i++) {

            if (!nString.contains("q") ){
                nString += input.charAt(i);
                return nString;
            }
        }


        return "";
    }

    public static Person declareAndReturnPersonNamedAda() {
        Person Ada = new Person();
        Ada.setName("Ada");

        return Ada;
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {

        Person Alan = new Person();
        Alan.setName("Alan");
        Alan.setCity("London");

        return Alan;
    }

    public static boolean isFromLondon(Person person) {

        return person.getCity().equalsIgnoreCase("London");
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        Place nyc = new Place();
        Place dc = new Place();
        Place fl = new Place();

        ArrayList<Place> locations = new ArrayList<Place>();

        locations.add(nyc);
        locations.add(dc);
        locations.add(fl);


        return locations;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
        // The HashMap should have key-value pairs of:
        // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
        // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
        return null;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
