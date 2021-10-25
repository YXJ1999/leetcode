package day02;

import java.util.Arrays;

/*给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
        示例 1：

        输入：nums = [-4,-1,0,3,10]
        输出：[0,1,9,16,100]
        解释：平方后，数组变为 [16,1,0,9,100]
        排序后，数组变为 [0,1,9,16,100]
        示例 2：

        输入：nums = [-7,-3,2,3,11]
        输出：[4,9,9,49,121]

        提示：
        1 <= nums.length <= 104
        -104 <= nums[i] <= 104
        nums 已按 非递减顺序 排序

        进阶：

        请你设计时间复杂度为 O(n) 的算法解决本问题

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class day0201 {
    public int[] sortedSquares(int[] nums) {
        for(int i = 1;i<nums.length;i++){
            int num = i-1;
            int temp = nums[i];
            while(num>=0&&temp<nums[num]){
                nums[num+1]=nums[num];
                num--;
            }
            if (i!=num+1){
                nums[num+1] =temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums ={-1,0,-2,3,9,6,4,8};
//        day0201 s=new day0201();
//        int[] a=s.sortedSquares(nums);
        Arrays.sort(nums);
        System.out.println(nums);
    }
    /*
     public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                ans[pos] = nums[i] * nums[i];
                ++i;
            } else {
                ans[pos] = nums[j] * nums[j];
                --j;
            }
            --pos;
        }
        return ans;
    }

作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array/solution/you-xu-shu-zu-de-ping-fang-by-leetcode-solution/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int negative = -1;
        for (int i = 0; i < n; ++i) {
            if (nums[i] < 0) {
                negative = i;
            } else {
                break;
            }
        }

        int[] ans = new int[n];
        int index = 0, i = negative, j = negative + 1;
        while (i >= 0 || j < n) {
            if (i < 0) {
                ans[index] = nums[j] * nums[j];
                ++j;
            } else if (j == n) {
                ans[index] = nums[i] * nums[i];
                --i;
            } else if (nums[i] * nums[i] < nums[j] * nums[j]) {
                ans[index] = nums[i] * nums[i];
                --i;
            } else {
                ans[index] = nums[j] * nums[j];
                ++j;
            }
            ++index;
        }

        return ans;
    }

作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array/solution/you-xu-shu-zu-de-ping-fang-by-leetcode-solution/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            ans[i] = nums[i] * nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }

作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array/solution/you-xu-shu-zu-de-ping-fang-by-leetcode-solution/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
}
