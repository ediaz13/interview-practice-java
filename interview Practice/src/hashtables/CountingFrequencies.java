package hashtables;

import java.util.HashMap;

public class CountingFrequencies {

    public HashMap<String, Integer> countFrequencies(String[] words) {
        HashMap<String, Integer> frequencies = new HashMap<>();
        for (String word: words) {
            frequencies.put(word, frequencies.getOrDefault(word, 0) + 1);
        }

        return frequencies;
    }
    public static void main(String[] args) {
        String[] words = {"hello", "world", "hello", "world", "hello", "world"};
        CountingFrequencies countingFrequencies = new CountingFrequencies();
        System.out.println(countingFrequencies.countFrequencies(words));
    }
}
