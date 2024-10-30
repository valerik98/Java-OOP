package FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _08_CustomComparator_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                                 .map(Integer::parseInt).collect(Collectors.toList());
        Comparator<Integer> customComparator = (first,second) -> {
            if (first%2==0 && second %2 !=0){
                return -1;
            } else if (first%2!=0 && second %2==0) {
                return 0;
            }else
                return first.compareTo(second);
        };

    }
}
