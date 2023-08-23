package String;

public class Solve {
    public static void main(String[] args) {
        String s = "733064366";
        String t = "459309139";
        SolveSolution solveSolution = new SolveSolution();
        System.out.println(solveSolution.solve(s,t));
    }
}



class SolveSolution {
    public String solve (String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();

        //auxiliary data structs
        StringBuilder sb = new StringBuilder();
        int i = cs.length - 1, j = ct.length - 1;
        int count = 0;
        int sum = 0;

        //normal case
        while (i >= 0 || j >= 0){
            int elementOfCs = 0;
            int elementOfCt = 0;
            sum = count;
            if (i >= 0) elementOfCs = cs[i--] - '0';
            if (j >= 0) elementOfCt = ct[j--] - '0';
            sum = elementOfCs + elementOfCt + sum;
            if (sum >= 10) {
                sum = sum - 10;
                count = 1;
            }else{
                count = 0;
            }
            sb.append(sum);
        }
        if(count > 0) sb.append(count);
        return sb.reverse().toString();
    }
}