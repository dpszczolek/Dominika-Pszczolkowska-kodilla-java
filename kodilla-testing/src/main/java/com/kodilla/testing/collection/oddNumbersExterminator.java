package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

class oddNumbersExterminator {
    ArrayList<Integer> numbers;
    ArrayList<Integer> even;

    public oddNumbersExterminator() {
        numbers = new ArrayList<Integer>();
        even = new ArrayList<Integer>(); }

    public int exterminate (ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                even.add(numbers.get(i));
            }
        }
        return even.size();
    }
}
