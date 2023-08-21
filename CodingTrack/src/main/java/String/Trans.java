package String;

public class Trans {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        appending strings
//        sb.append("Hello");
//        sb.append(" ");
//        sb.append("World!");
//        System.out.println(sb.toString());
//
//        sb.insert(5, "Awesome ");
//        System.out.println(sb.toString());
//
//        sb.delete(5, 13);
//        System.out.println(sb.toString());
//
//        sb.replace(0, 5, "Hi");
//        System.out.println(sb.toString());
        String s = "This is a sample";
        int n = 16;
        TransSolution ts = new TransSolution();
        System.out.println(ts.trans(s,n));
    }
}


class TransSolution {
    //upper case to lower case or lower case to upper case
    public String helper(String str){
        //auxiliary data structs
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= str.length() - 1; i++){
            Character c = str.charAt(i);

            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }


    public String trans(String s, int n){
        //auxiliary data structs
        StringBuilder sb = new StringBuilder();

        String[] tmp = s.split(" ",-1);
        for(int i = tmp.length -1; i >= 0; i--){
            sb.append(helper(tmp[i]));
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
