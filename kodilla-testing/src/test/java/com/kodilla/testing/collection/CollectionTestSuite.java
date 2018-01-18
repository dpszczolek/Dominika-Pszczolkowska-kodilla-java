package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
@Before
    public void before() {
        System.out.println("Test start"); }
@After
    public void after() {
        System.out.println("Test end");}
@Test
    public void testOddNumbersExterminatorEmptyList () {

    oddNumbersExterminator odd = new oddNumbersExterminator();
    ArrayList <Integer> numbers = new ArrayList<Integer>();

    int result = odd.exterminate(numbers);
    Assert.assertEquals(0, result);
    System.out.println("Brak liczb na liscie");
}
@Test
    public void testOddNumbersExterminatorNormalList () {

    oddNumbersExterminator odd = new oddNumbersExterminator();
    ArrayList <Integer> numbers = new ArrayList <Integer> ();
    ArrayList<Integer> even = new ArrayList<Integer> ();

    numbers.add(5);
    numbers.add(10);
    numbers.add(32);
    numbers.add(7);
    numbers.add(9);
    numbers.add(43);

    int result = odd.exterminate(numbers);
    int exp = 2;
    Assert.assertEquals(exp, result);
    System.out.println("Test Normal List OK");

}
}
