package foudamental.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(nums, target)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target){
        //define your output res
        int[] res = new int[2];

        //base cases
        if (nums == null || nums.length == 0) {
            return res;
        }

        //auxiliary data struts
        Map<Integer,Integer> map = new HashMap<>();

        // normal cases

        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (map.containsKey(diff)){
                res[0] = map.get(diff);
                res[1] = i;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}