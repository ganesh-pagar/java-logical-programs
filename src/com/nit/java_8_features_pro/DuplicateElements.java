package com.nit.java_8_features_pro;

import java.util.*;
import java.util.stream.*;

public class DuplicateElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
            10, 20, 30, 20, 40, 50, 10, 60, 30
        );

        Set<Integer> duplicates = new HashSet<>();

        Set<Integer> result = numbers.stream()
            .filter(n -> !duplicates.add(n))
            .collect(Collectors.toSet());

        System.out.println("Duplicate elements: " + result);
    }
}

