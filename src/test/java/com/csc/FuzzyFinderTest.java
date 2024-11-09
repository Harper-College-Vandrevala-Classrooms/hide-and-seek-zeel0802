package com.csc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class FuzzyFinderTest {

    @Test
    public void testLinearSearchSorted() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        List<Feeling> sortedFuzzies = generator.sortedRainbowFuzzies();
        
        int index = finder.linearSearch(sortedFuzzies);
        assertNotEquals(-1, index, "Linear search should find the gold fuzzy in sorted list.");
    }

    @Test
    public void testBinarySearchSorted() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        List<Feeling> sortedFuzzies = generator.sortedRainbowFuzzies();
        
        int index = finder.binarySearch(sortedFuzzies);
        assertNotEquals(-1, index, "Binary search should find the gold fuzzy in sorted list.");
    }

    @Test
    public void testBinarySearchUnsorted() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        List<Feeling> randomFuzzies = generator.randomizedRainbowFuzzies();
        
        int index = finder.binarySearch(randomFuzzies);
        assertEquals(-1, index, "Binary search should fail for unsorted list.");
    }

    @Test
    public void testLinearSearchUnsorted() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();
        List<Feeling> randomFuzzies = generator.randomizedRainbowFuzzies();
        
        int index = finder.linearSearch(randomFuzzies);
        assertNotEquals(-1, index, "Linear search should find the gold fuzzy in unsorted list.");
    }
}
