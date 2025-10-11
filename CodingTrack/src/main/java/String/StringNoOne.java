package String;

public class StringNoOne {
    public static void main(String[] args) {
        StringNoOne sno = new StringNoOne();
        String[] words = {"a", "b", "c"};
        System.out.println(sno.joinwords(words));

    }
    public String joinwords(String[] words){
        StringBuilder s = new StringBuilder();
        for (String w : words){
            s.append(w);
        }
        return s.toString();
    }
}
