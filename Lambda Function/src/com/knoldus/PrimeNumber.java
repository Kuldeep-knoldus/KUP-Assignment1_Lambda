package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> primeNumbers = PrimeNumber.getPrimeNumbers(100);
        System.out.println(primeNumbers);
    }

    public static List<Integer> getPrimeNumbers(int range) {
        return IntStream.iterate(2, i -> ++i)
                .filter(number -> isPrime(number)).boxed()
                .limit(range)
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream
                .range(2, number)
                .noneMatch(i -> number % i == 0);
    }
}