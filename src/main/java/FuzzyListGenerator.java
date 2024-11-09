package com.csc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FuzzyListGenerator {

    public List<Feeling> sortedRainbowFuzzies() {
        List<Feeling> fuzzies = new ArrayList<>();
        fuzzies.add(new Fuzzy("blue"));
        fuzzies.add(new Fuzzy("green"));
        fuzzies.add(new Fuzzy("gold")); // Golden fuzzy
        fuzzies.add(new Fuzzy("red"));
        fuzzies.add(new Fuzzy("yellow"));
        fuzzies.sort((f1, f2) -> f1.description().compareTo(f2.description()));
        return fuzzies;
    }

    public List<Feeling> randomizedRainbowFuzzies() {
        List<Feeling> fuzzies = sortedRainbowFuzzies();
        fuzzies.add(new Prickly()); // Add a prickly for variety
        Collections.shuffle(fuzzies);
        return fuzzies;
    }
}
