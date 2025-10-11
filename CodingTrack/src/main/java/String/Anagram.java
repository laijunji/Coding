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

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram("abc", "bac"));

    }
}
