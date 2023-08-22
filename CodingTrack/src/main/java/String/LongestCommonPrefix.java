package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefixSolution s = new LongestCommonPrefixSolution();
        String[] strs = {"abca","abc","abca","abc","abcc"};
        System.out.println(s.longestCommonPrefix(strs));
    }
}



class LongestCommonPrefixSolution{

    public String longestCommonPrefix (String[] strs) {
        //base case
        if (strs.length == 0) return "";

        //normal case
        String tmp = strs[0];
        for (int i = 1; i < strs.length; i++){
            String str = strs[i];
            while(str.indexOf(tmp) != 0){
                tmp = tmp.substring(0,tmp.length() - 1);
            }
        }
        return tmp;
    }
}