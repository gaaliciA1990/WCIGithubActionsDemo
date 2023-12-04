package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);

        numbers.add(9);
        numbers.add(2);

        numbers.add(7);

        printNumbers(numbers);
    }

    public static void printNumbers(List<Integer> numbers) {
        System.out.println("This is a list of numbers: ");
        for (int i = 0; i < numbers.size(); i++)
            System.out.println(numbers.get(i));
    }
}