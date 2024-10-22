package com.csc;

import java.util.ArrayList;

public class FuzzyFinder {

    // Linear Search Method to find the index of the golden fuzzy
    public int linearSearch(ArrayList<Fuzzy> fuzzies) {
        for (int i = 0; i < fuzzies.size(); i++) {
            if (fuzzies.get(i).color.equals("gold")) {
                return i;  // Found the golden fuzzy!
            }
        }
        return -1;  // Golden fuzzy not found
    }

    // Binary Search Method to find the index of the golden fuzzy
    public int binarySearch(ArrayList<Fuzzy> fuzzies) {
        int left = 0;
        int right = fuzzies.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            Fuzzy midFuzzy = fuzzies.get(mid);

            if (midFuzzy.color.equals("gold")) {
                return mid;  // Found the golden fuzzy!
            } else if (midFuzzy.color.compareTo("gold") < 0) {
                left = mid + 1;  // Continue on the right half
            } else {
                right = mid - 1;  // Continue on the left half
            }
        }
        return -1;  // Golden fuzzy not found
    }

    public static void main(String[] args) {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        // Test both sorted and randomized fuzzies
        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

        // Run the searches
        int linearSorted = finder.linearSearch(sortedFuzzies);
        int binarySorted = finder.binarySearch(sortedFuzzies);
        int linearRandom = finder.linearSearch(randomFuzzies);
        int binaryRandom = finder.binarySearch(randomFuzzies);

        // Output results
        System.out.println("Linear Search (Sorted): " + linearSorted);
        System.out.println("Binary Search (Sorted): " + binarySorted);
        System.out.println("Linear Search (Random): " + linearRandom);
        System.out.println("Binary Search (Random): " + binaryRandom);
    }
}
