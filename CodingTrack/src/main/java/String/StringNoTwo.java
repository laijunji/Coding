package String;

public class StringNoTwo {
    public boolean isUnique(String s){
        if(s.length() > 128) return false;

        boolean[] charSet = new boolean[128];
        for (int i = 0; i < s.length(); i++){
            int val = s.charAt(i);
            if (charSet[val]) {
                return false;
            } else {
                charSet[val] = true;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        StringNoTwo stringNoTwo = new StringNoTwo();
        System.out.println(stringNoTwo.isUnique("abda"));
    }
}
