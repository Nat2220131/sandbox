package org.example.lambda;

import java.util.function.*;

public class LambdaDemo {
    public static void main(String[] args) {

        //x -> x * 2

        // 4 types of Lambdas
        Predicate<String> predicate = x -> x.startsWith("a");
        // Predicate takes a value and returns a boolean aka true or false

        Function<Integer, Integer> function = x -> x * 2; // Pure Function
        // Function takes a value and returns a value

        Supplier<String> supplier = () -> "Hello Lambda";
        // Suppplier takes nothing and returns a value.

        Consumer<String> comsumer = System.out::println;
        Consumer<Integer> integerr = Integer::toOctalString;
        // Consumer takes a value and returns nothing

    }



}
