package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class PrimeNumberImpl {
    public static void main(String[] args) {
        List<Integer> primeNumbers = PrimeNumberImpl.PrimeNumbers();
        System.out.println(primeNumbers);
    }

    public static List<Integer> PrimeNumbers() {
        return IntStream.iterate(2, i -> ++i)
                .filter(number -> isPrime(number)).boxed()
                .limit(100)
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream
                .range(2, number)
                .noneMatch(i -> number % i == 0);
    }
}