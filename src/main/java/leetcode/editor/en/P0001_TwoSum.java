package leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;

public class P0001_TwoSum {


    public static void main(String[] args) {
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> valueMapIndex = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                valueMapIndex.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if(valueMapIndex.containsKey(complement) && valueMapIndex.get(complement) != i) {
                    return new int[] {i, valueMapIndex.get(complement)};
                }
            }
            throw new IllegalArgumentException("not such answer");
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}
