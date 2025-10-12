package String;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public boolean canPermutePalindrome(String s){
        char[] charArray = s.toCharArray();
        Map<Character, Integer> hashmap = new HashMap<Character, Integer>();
        for (char c : charArray) {
            hashmap.put(c, hashmap.getOrDefault(c,0) + 1);
        }

        int oddCnt = 0;
        for (Integer value : hashmap.values()) {
            if(value % 2 != 0){
                oddCnt++;
            }
        }

        return oddCnt <= 1;
    }


    public static void main(String[] args) {
        PalindromePermutation p = new PalindromePermutation();
        System.out.println(p.canPermutePalindrome("aabbccd"));
    }
}
