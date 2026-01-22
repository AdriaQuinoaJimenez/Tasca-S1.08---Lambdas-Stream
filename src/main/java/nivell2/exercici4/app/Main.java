package nivell2.exercici4.app;

import nivell2.exercici4.interfaces.ListFilterer;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int INDEX = 0;
        final String FILTER_BY_LETTER = "e";
        final String MODIFY_THIS_LETTER = "a";
        final String MODIFIER = "4";
        final String FILTER_BY_NUMBER = "[0-9]+(\\.[0-9]+)?";

        List<String> stringList = List.of("Pilota", "3.4", "Restaurant", "4", "90", "Cadena", "Cadira", "Electricitat", "74");

        ListFilterer alphabeticalSorterer = list -> list.stream()
                .sorted((str1, str2) -> str1.charAt(INDEX) - str2.charAt(INDEX))
                .toList();
        ListFilterer sortererByLetter = list -> list.stream()
                .sorted(Comparator.comparing(str -> !str.contains(FILTER_BY_LETTER)))
                .toList();
        ListFilterer modifierLetter = list -> list.stream()
                .map(str -> str.replace(MODIFY_THIS_LETTER, MODIFIER))
                .toList();
        ListFilterer numsFilterer = list -> list.stream()
                .filter(str -> str.matches(FILTER_BY_NUMBER))
                .toList();

        System.out.println("Original list: " + stringList);
        System.out.println("Sorted by alphabetical order: " + alphabeticalSorterer.filter(stringList));
        System.out.println("Sortered by letter: " + sortererByLetter.filter(stringList));
        System.out.println("Letter changed: " + modifierLetter.filter(stringList));
        System.out.println("Show only numbers:" + numsFilterer.filter(stringList));
    }
}
