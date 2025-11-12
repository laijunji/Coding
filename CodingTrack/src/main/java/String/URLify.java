package String;

public class URLify {
    public static String urlify(String s,int trueLenth){
        return s.substring(0,trueLenth).replaceAll(" ","%20");
    }


    public static String urlifyS(String s,int trueLenth){
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : charArray) {
            if(c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String input = "Mr John Smith    ";
        int trueLength = 13; // "Mr John Smith"的实际长度
        System.out.println(URLify.urlify(input, trueLength));
        System.out.println("----------");
        System.out.println(URLify.urlify(input, trueLength));
    }
}
