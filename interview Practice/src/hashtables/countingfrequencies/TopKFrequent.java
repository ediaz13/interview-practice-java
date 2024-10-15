package hashtables.countingfrequencies;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequent {

    public List<String> mostFrequentWords(String[] words, int k) {
        HashMap<String, Integer> frequencies = new HashMap<>();
        for (String word: words) {
            frequencies.put(word, frequencies.getOrDefault(word, 0) + 1);
        }

        //Solucion sin streams
        /*
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        maxHeap.addAll(frequencies.entrySet());

        ArrayList<String> topK = new ArrayList<>();
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            topK.add(maxHeap.poll().getKey());
        }
         */

        List<String> topK = frequencies.entrySet().stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .limit(k)
            .map(Map.Entry::getKey)
            .collect(Collectors.toCollection(ArrayList::new));

        return topK;
    }
    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "a"};
        TopKFrequent topKFrequent = new TopKFrequent();
        System.out.println((topKFrequent.mostFrequentWords(words, 4)));
    }
}
