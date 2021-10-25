package day01;

public class day01 {
    /*
    给定一个n个元素有序的（升序）整型数组nums 和一个目标值target，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
    示例 1:
    输入: nums = [-1,0,3,5,9,12], target = 9
    输出: 4
    解释: 9 出现在 nums 中并且下标为 4
    示例2:
    输入: nums = [-1,0,3,5,9,12], target = 2
    输出: -1
    解释: 2 不存在 nums 中因此返回 -1
    提示：
    你可以假设 nums中的所有元素是不重复的。
    n将在[1, 10000]之间。
    nums的每个元素都将在[-9999, 9999]之间。
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/binary-search
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int search(int[] nums, int target) {
        return gitNum(0,nums.length-1,target,nums);
    }
    public int gitNum(int left,int right,int target,int[] nums){
        int middle =(left + right)/2;
        if(left>right){
            return -1;
        }
        if(nums[middle] > target){
            return gitNum(left,middle-1,target,nums);
        }else if(nums[middle] < target){
            return gitNum(middle+1,right,target,nums);
        }else{
            return middle;
        }
    }

    public static void main(String[] args) {
        day01 d=new day01();
        int[] nums ={-1,0,3,5,9,12};
        int t =2 ;
        System.out.println(d.search(nums,2));
    }
    /*
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/binary-search/solution/er-fen-cha-zhao-by-leetcode-solution-f0xw/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
}
