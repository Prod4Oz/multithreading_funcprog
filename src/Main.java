import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

import java.util.List;


public class Main {
    public static void main(String[] args) {
// истользуем чистые функции, лямды, Function = функциональное программирование
        String mg = "ааа в п вп вп  фук ";

        Function<String, List<String>> function = (a) ->
                Arrays.stream(a.split(" "))
                        .sorted()
                        .distinct()
                        .toList();


        function.apply(mg).forEach(System.out::println);
    }
    }
