package nivell2.exercici2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final List<Integer> originalNumbersList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Original list: " + originalNumbersList);
        System.out.println(processNumbers(originalNumbersList));
    }

    public static String processNumbers (List<Integer> numbers) {
        final String EVEN = "e";
        final String ODD = "o";

        return numbers.stream()
                .map( number -> (number % 2 == 0) ? EVEN + number : ODD + number)
                .collect(Collectors.joining(", "));
    }
}
