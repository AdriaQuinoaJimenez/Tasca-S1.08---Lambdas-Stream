package nivell1.exercici2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<String> names = List.of("Adri", "Mario", "Ernesto", "Joseba", "Maria", "Oliver");
        final int MAX_LENGTH = 5;

        List<String> filteredNames = names.stream().filter(name -> name.toLowerCase().contains("o") && name.length() > MAX_LENGTH ).toList();
        System.out.println(names);
        System.out.println(filteredNames);
    }
}
