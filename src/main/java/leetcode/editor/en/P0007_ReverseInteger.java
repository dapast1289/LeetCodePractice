package leetcode.editor.en;

public class P0007_ReverseInteger {


    public static void main(String[] args) {
        Solution solution = new P0007_ReverseInteger().new Solution();
        System.out.println(solution.reverse(1534236469));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            if (x < Math.pow(2, 31) * -1 || x > Math.pow(2, 31) - 1) {
                return 0;
            }
            int signed = 1;
            if (x < 0) {
                signed = -1;
                x = x * -1;
            }
            int answer = 0;
            while (x / 10 != 0 || x % 10 != 0) {
                int remain = x % 10;
                if (answer * 10 / 10 == answer) {
                    answer = answer * 10 + remain;
                } else {
                    return 0;
                }
                x /= 10;
            }
            return answer * signed;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
