package String;

public class OneEditAway {
    public static boolean oneEidt(String first,String second){
        if (Math.abs(first.length() - second.length()) > 1){
            return false;
        }

        if (first.length() - second.length() > 0) {
            return oneEidt(second, first);
        }

        int i,j = 0;
        boolean findDiff = false;




        while (i < first.length() )
    }
}
