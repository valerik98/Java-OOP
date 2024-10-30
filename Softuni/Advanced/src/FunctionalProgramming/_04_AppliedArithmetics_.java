package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _04_AppliedArithmetics_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        Function<List<Integer>, List<Integer>> add = list -> list.stream()
                .map(n -> n + 1)
                .collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = list -> list.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = list -> list.stream()
                .map(n -> n - 1)
                .collect(Collectors.toList());
        Consumer<List<Integer>> print = list -> list.forEach(n -> System.out.print(n + " "));

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
