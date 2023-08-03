package Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MoreThanHalfNum {
    public static void main(String[] args) {
        MoreThanHalfNumSolution s = new MoreThanHalfNumSolution();
        int[] numbers = {1,2,2,2,2,4};
        System.out.println(s.MoreThanHalfNum_Solution(numbers));
    }

}



class MoreThanHalfNumSolution{
    public int MoreThanHalfNum_Solution (int[] numbers) {
        //input data structs array

        //base case
        if(numbers.length == 0 || numbers == null){
            return 0;
        }


        //auxiliary data structs
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            if(!hashMap.containsKey(numbers[i])){
                hashMap.put(numbers[i],1);
            }else{
                hashMap.put(numbers[i],hashMap.get(numbers[i]) + 1);
            }
        }


        //auxiliary data structs
        Iterator<Map.Entry<Integer,Integer>> itr = hashMap.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Integer,Integer> entry = itr.next();
            if(entry.getValue() > numbers.length / 2){
                return entry.getKey();
            }
        }
        return 0;
    }
}