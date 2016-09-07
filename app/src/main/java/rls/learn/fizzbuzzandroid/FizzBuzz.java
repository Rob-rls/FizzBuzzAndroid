package rls.learn.fizzbuzzandroid;

/**
 * Created by rls on 07/09/2016.
 */
public class FizzBuzz {

//    public FizzBuzz() {
//    }

    public static String getResult(int number) {
        if (isDivisibleBy15(number)) return "FizzBuzz";
        if (isDivisibleBy3(number)) return "Fizz";
        if (isDivisibleBy5(number)) return "Buzz";
        return Integer.toString(number);
    }

    private static Boolean isDivisibleBy(int number, int divisor) {
        return (number % divisor == 0);
    }

    private static Boolean isDivisibleBy3(int number) {
        return isDivisibleBy(number, 3);
    }

    private static Boolean isDivisibleBy5(int number) {
        return isDivisibleBy(number, 5);
    }

    private static Boolean isDivisibleBy15(int number) {
        return isDivisibleBy(number, 15);
    }


}
