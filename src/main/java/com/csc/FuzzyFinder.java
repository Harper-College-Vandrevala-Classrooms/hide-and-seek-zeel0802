package com.csc;

import java.util.List;

public class FuzzyFinder {

    public int linearSearch(List<Feeling> fuzzies) {
        for (int i = 0; i < fuzzies.size(); i++) {
            if ("gold".equals(fuzzies.get(i).description())) {
                return i;
            }
        }
        return -1; // Gold fuzzy not found
    }

    public int binarySearch(List<Feeling> fuzzies) {
        int low = 0;
        int high = fuzzies.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String description = fuzzies.get(mid).description();

            if ("gold".equals(description)) {
                return mid;
            } else if (description.compareTo("gold") < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Gold fuzzy not found
    }
}
