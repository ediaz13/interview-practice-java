package hashtables;

import java.util.ArrayList;
import java.util.HashMap;

public class FindingDuplicates {
    public ArrayList<Integer> findDuplicates(ArrayList<Integer> numbers) {
        ArrayList<Integer> duplicates = new ArrayList<>();

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int number : numbers) {
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        }

        for (int number : frequency.keySet()) {
            if (frequency.get(number) > 1) {
                duplicates.add(number);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(5);

        FindingDuplicates findingDuplicates = new FindingDuplicates();
        System.out.println(findingDuplicates.findDuplicates(numbers));
    }
}
