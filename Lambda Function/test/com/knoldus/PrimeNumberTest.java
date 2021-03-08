package com.knoldus;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class PrimeNumberTest {
    @Test
    public void getPrimeNumber() {
        List<Integer> actualOutput1 = PrimeNumber.getPrimeNumbers(5);
        List<Integer>  expectedOutput1 = Arrays.asList(2,3,7,5,11);
        Assert.assertTrue(actualOutput1.size() == expectedOutput1.size() && actualOutput1.containsAll(expectedOutput1) && expectedOutput1.containsAll(actualOutput1));

        List<Integer> actualOutput2 = PrimeNumber.getPrimeNumbers(0);
        List<Integer>  expectedOutput2 = Collections.emptyList();
        Assert.assertTrue(actualOutput2.size() == 0 && actualOutput2.containsAll(expectedOutput2) && expectedOutput2.containsAll(actualOutput2));

        List<Integer> actualOutput3 = PrimeNumber.getPrimeNumbers(1);
        List<Integer>  expectedOutput3 = Collections.singletonList(1);
        // List<Integer>  expectedOutput4 = Arrays.asList(1);
        Assert.assertFalse(actualOutput3.size() == expectedOutput3.size() && actualOutput3.containsAll(expectedOutput3) && expectedOutput3.containsAll(actualOutput3));

        List<Integer> actualOutput4 = PrimeNumber.getPrimeNumbers(50);
        List<Integer>  expectedOutput4 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229);
        Assert.assertTrue(actualOutput4.size() == expectedOutput4.size() && actualOutput4.containsAll(expectedOutput4) && expectedOutput4.containsAll(actualOutput4));


    }

}