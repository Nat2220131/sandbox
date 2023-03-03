package org.example.sreamapi;

import java.util.function.Supplier;
import java.util.*;

public class StringGenerator implements Supplier<String> {

    Random random = new Random();
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String get() {
        return "" + letters[random.nextInt(letters.length)];
    }
}
