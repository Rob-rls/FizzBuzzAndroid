package rls.learn.fizzbuzzandroid;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rls on 07/09/2016.
 */
public class FizzBuzzTest {

    @Test
    public void getResultShouldReturnFizzWhenDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void getResultKnowsWhenNotDivisibleBy3() {
        assertNotEquals("Fizz", FizzBuzz.getResult(1));
    }

    @Test
    public void getResultReturnsBuzzWhenDivisbleBy5(){
        assertEquals("Buzz", FizzBuzz.getResult(5));
    }

    @Test
    public void getResultKnowsWhenNotDivisibleBy5() {
        assertNotEquals("Buzz", FizzBuzz.getResult(1));
    }

    @Test
    public void getResultReturnsFizzBuzzWhenDivisibleBy15() {
        assertEquals("FizzBuzz", FizzBuzz.getResult(15));
    }

    @Test
    public void getResultKnowsWhenNotDivisibleBy15() {
        assertNotEquals("FizzBuzz", FizzBuzz.getResult(1));
    }
}