package day01;

public class day0103 {
    /*
    给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    请必须使用时间复杂度为 O(log n) 的算法。
    示例 1:
    输入: nums = [1,3,5,6], target = 5
    输出: 2
    示例2:

    输入: nums = [1,3,5,6], target = 2
    输出: 1
    示例 3:

    输入: nums = [1,3,5,6], target = 7
    输出: 4
    示例 4:

    输入: nums = [1,3,5,6], target = 0
    输出: 0
    示例 5:

    输入: nums = [1], target = 0
    输出: 0

    提示:

    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums 为无重复元素的升序排列数组
    -104 <= target <= 104
    */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int middle =left + (right-left)/2;
        while(left<=right){
            if(nums[middle] > target){
                right = middle -1;
                middle = left + (right-left)/2;
            }else if(nums[middle] < target){
                left = middle +1;
                middle = left + (right-left)/2;
            }else{
                return middle;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        day0103 a= new day0103();
        int[] nums = {};
        int target =5;
        System.out.println(a.searchInsert(nums,target));
    }
    /*
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/search-insert-position/solution/sou-suo-cha-ru-wei-zhi-by-leetcode-solution/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
}
