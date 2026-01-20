package nivell2.exercici1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<String> names = List.of("Ana", "Francisco", "Jose", "Adri", "Mario", "Natalia", "Paco", "Ale");

        System.out.println("Original list: \n" + names);
        System.out.println("------------------");
        System.out.println("Filtered list: " + filterNames(names));
    }

    public static List<String> filterNames(List<String> names){
        final int MAX_LENGTH = 3;
        final String STARTS_WITH = "A";

        return names.stream()
                .filter(name -> name.length() == MAX_LENGTH && name.startsWith(STARTS_WITH))
                .toList();
    }
}
