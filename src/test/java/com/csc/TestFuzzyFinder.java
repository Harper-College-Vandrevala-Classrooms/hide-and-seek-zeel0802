package com.csc;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestFuzzyFinder {

    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();

    @Test
    public void testLinearSearchSorted() {
        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        int result = finder.linearSearch(sortedFuzzies);
        assertEquals(result >= 0, true);  // Should find the golden fuzzy
    }

    @Test
    public void testBinarySearchSorted() {
        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        int result = finder.binarySearch(sortedFuzzies);
        assertEquals(result >= 0, true);  // Should find the golden fuzzy
    }

    @Test
    public void testLinearSearchRandom() {
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        int result = finder.linearSearch(randomFuzzies);
        assertEquals(result >= 0, true);  // Should find the golden fuzzy
    }

    @Test
    public void testBinarySearchRandom() {
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        int result = finder.binarySearch(randomFuzzies);
        assertEquals(result, -1);  // Binary search should fail on unsorted list
    }
}
