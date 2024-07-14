package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = new int[]{1,2,4,6,10};
        TwoSumSolution s = new TwoSumSolution();
        int[] s1 = s.twoSum(input, 8);
        System.out.println("first Element index is :" + s1[0] + "  And second Element index is :" + s1[1] );
    }
}

class TwoSumSolution {
    public int[] twoSum(int[] numbers, int target){
       int i = 0;
       int j = numbers.length - 1;
       while (i != j && numbers[i] + numbers[j] != target) {
           if (numbers[i] + numbers[j] > target ){
               j--;
           }else {
               i++;
           }
       }
       return new int[] {i, j};
    }
}