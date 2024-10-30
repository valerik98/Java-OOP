package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_SortEvenNumbers_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> evenNumbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers.toString().replace("[","").replace("]",""));
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers.toString().replace("[","").replace("]",""));

    }
}
