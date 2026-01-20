package nivell1.exercici6;

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
                .sorted((element1, element2) -> element1.length() - element2.length())
                .toList();
        System.out.println("Ordered list: ");
        orderedList.forEach(System.out::println);
    }
}
