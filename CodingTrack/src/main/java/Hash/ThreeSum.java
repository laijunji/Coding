package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ThreeSum {
    public static void main(String[] args) {
        int[] num = {-2,0,1,1,2};
        ThreeSumSolution s = new ThreeSumSolution();
        System.out.println(s.threeSum(num));
    }
}


class ThreeSumSolution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num){
        //base case
        if (num == null || num.length == 0) return new ArrayList<>();

        //preprocess
        Arrays.sort(num);

        //auxiliary data struct
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> firstSet = new HashSet<>();

        //normal case
        for (int i = 0; i < num.length; i++){
            hashMap.put(num[i],i);
        }

        for (int i = 0; i < num.length - 2; i++){
            if (firstSet.contains(num[i])) continue;
            firstSet.add(num[i]);

            HashSet<Integer> secondSet = new HashSet<>();
            for (int j = i+1; j < num.length -1; j++){
                if(secondSet.contains(num[j])) continue;
                secondSet.add(num[j]);
                int tmp = (num[i] + num[j]) * -1;
                if(hashMap.containsKey(tmp) && hashMap.get(tmp) > j){
                    ArrayList<Integer> resList = new ArrayList<>();
                    resList.add(num[i]);
                    resList.add(num[j]);
                    resList.add(tmp);
                    res.add(resList);
                }
            }
        }
        return res;
    }
}


