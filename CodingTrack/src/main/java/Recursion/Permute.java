package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Permute {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        PermuteSolution permuteSolution = new PermuteSolution();
        System.out.println(permuteSolution.permute(num).toString());
    }
}


class PermuteSolution {
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list = new ArrayList<>();


    public ArrayList<ArrayList<Integer>> permute (int[] num) {
        Arrays.sort(num);
        this.dfs(num,this.list);
        return this.res;
    }

    private void dfs (int[] num, ArrayList<Integer> list){
        if (num.length == list.size()){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (list.contains(num[i])){
                continue;
            }
            list.add(num[i]);
            this.dfs(num, list);

            list.remove(list.size() - 1);
        }
    }
}