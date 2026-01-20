package nivell1.exercici1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<String> names = List.of("Adri", "Mario", "Ernesto", "Joseba", "Maria", "Oliver");

        List<String> filteredNames = names.stream().filter(name -> name.toLowerCase().contains("o")).toList();
        System.out.println(names);
        System.out.println(filteredNames);
    }
}
