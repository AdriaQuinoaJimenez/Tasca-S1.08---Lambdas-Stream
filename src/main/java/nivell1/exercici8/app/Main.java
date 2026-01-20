package nivell1.exercici8.app;

import nivell1.exercici8.interfaces.StringRevers;

public class Main {
    public static void main(String[] args) {
        String originalText = "Hello World";
        StringRevers stringRevers = str -> new StringBuilder(str).reverse().toString();

        System.out.println(originalText);
        System.out.println(stringRevers.reverse(originalText));
    }
}
