package Hash;

import java.util.HashMap;

public class MinNumberDisappeared {
    public static void main(String[] args) {
        MinNumberDisappearedSolution s = new MinNumberDisappearedSolution();
        int[] nums = {1,0,2};
        System.out.println(s.minNumberDisappeared(nums));
    }
}

class MinNumberDisappearedSolution {
    public int minNumberDisappeared(int[] nums) {
        //base case
        if (nums.length == 0 || nums == null) return -1;

        //auxiliary data structs
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        //normal case
        for (int i = 0; i < nums.length ; i++){
            hashMap.put(nums[i],1);
        }

        int ans = 1;
        for (int i = 0; i < hashMap.size(); i++){
            if (hashMap.containsKey(ans)){
                ans++;
            }
        }
        return ans;
    }
}