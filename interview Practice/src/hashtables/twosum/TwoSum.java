package hashtables.twosum;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {

    public ArrayList<Integer> twoSum(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> mapIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mapIndex.put(nums[i], i);
        }

        System.out.println(mapIndex.keySet());
        System.out.println(mapIndex.values());

         for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (mapIndex.containsKey(complement)) {
                result.add(i);
            }

         }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.twoSum(nums, target));

    }
}
