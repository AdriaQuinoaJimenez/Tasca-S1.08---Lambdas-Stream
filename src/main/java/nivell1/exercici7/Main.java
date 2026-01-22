package nivell1.exercici7;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Object> list = List.of(1, 2.4, "Ordinador", 4, "Cotxe", "Pilota", 7, 8, "Videojoc");

        System.out.println("First list: ");
        list.forEach(System.out::println);
        System.out.println("---------------------");

        List<String> orderedList = list.stream()
                .filter(objectName -> objectName instanceof String)
                .map(stringName -> (String) stringName)
                .sorted(Comparator.comparing(String::length).reversed())
                .toList();
        System.out.println("Ordered list: ");
        orderedList.forEach(System.out::println);
    }
}
