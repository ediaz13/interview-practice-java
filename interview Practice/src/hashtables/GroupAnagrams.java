package hashtables;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String, List<String>> anagrams = new Hashtable<>();
        List<List<String>> listAnagrams = new ArrayList<>();

        for (String str : strs ) {
            char[] chars = str.toCharArray();
            java.util.Arrays.sort(chars);
            String sorted = new String(chars);
            if (anagrams.containsKey(sorted)) {
                anagrams.get(sorted).add(str);
            } else {
                List<String> anagram = new ArrayList<>();
                anagram.add(str);
                anagrams.put(sorted, anagram);
            }

        }

        for (String key : anagrams.keySet()) {
            listAnagrams.add(anagrams.get(key));
        }

        return listAnagrams;

    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(strs));
    }
}
