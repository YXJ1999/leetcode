package dome;

import java.util.LinkedList;
import java.util.List;

public class demo {
//     final int[]  array;
//
//    public demo() {
//        array = new int[1];
//    }
//    public void write(){
//        array[0]=2;
//    }
//
//    public static void main(String[] args) {
//        demo demo=new demo();
//        System.out.println(demo.array[0]);
//        demo.write();
//        System.out.println(demo.array[0]);
//    }
public static List<Integer> majorityElement(int[] nums) {
    int count1 = 0;
    int count2 = 0;
    int num1 = nums[0];
    int num2 = nums[0];
    for (int num : nums) {
        if (num1 == num) {
            count1++;
            continue;
        }
        if(num2 == num){
            count2++;
            continue;
        }
        if (count1==0){
            num1=num;
            count1++;
            continue;
        }
        if(count2==0){
            num2=num;
            count2++;
            continue;
        }
        count1--;
        count2--;
    }
    count1=0;
    count2=0;
    for(int num:nums){
        if(num==num1){
            count1++;
        }else if(num==num2){
            count2++;
        }
    }
    LinkedList<Integer> list = new LinkedList();
    if(count1>nums.length/3){
        list.add(num1);
    }
    if(count2>nums.length/3){
        list.add(num2);
    }
    return list;
}

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        majorityElement(nums);
    }

}
