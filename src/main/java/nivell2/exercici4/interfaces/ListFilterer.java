package nivell2.exercici4.interfaces;

import java.util.List;

@FunctionalInterface
public interface ListFilterer {
    List<String> filter(List<String> stringList);
}
