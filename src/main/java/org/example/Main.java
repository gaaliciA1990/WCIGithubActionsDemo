package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.beans.BeanDescriptor;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printNumbers(concatNumbersToList(args));
    }

    public static List<String> concatNumbersToList(String[] nums) {
        List<String> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(nums));
        return numbers;
    }

    public static void printNumbers(List<String> numbers) {
        System.out.println("This is a list of numbers: ");

        for (String number : numbers) {
            System.out.println(number);
        }
    }
}