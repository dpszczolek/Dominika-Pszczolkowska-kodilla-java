package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        int[] numbers = {3, 4, 7, 2, 76, 37, 58, 29, 87, 45, 64, 23, 66, 94, 78, 90, 12, 34, 54, 56};

        double result = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(45.95, result, 0.0001);
    }
}
