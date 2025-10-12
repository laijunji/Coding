package String;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s1, String s2){
        char[] charArrayOne = s1.toCharArray();
        char[] charArrayTwo = s2.toCharArray();
        Arrays.sort(charArrayOne);
        Arrays.sort(charArrayTwo);

        return Arrays.equals(charArrayOne,charArrayTwo);

    }
    
    public boolean permutation(String s1, String s2) {
        char[] chars = new char[128];
        char[] chars1 = s1.toCharArray();
        for (char c : chars1) {
            chars[c]++;
        }

        for (int j = 0; j < s2.length(); j++) {
            chars[s2.charAt(j)]--;
            if(chars[s2.charAt(j)] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram("abc", "bac"));
        System.out.println(anagram.permutation("abc", "bac"));

    }
}
